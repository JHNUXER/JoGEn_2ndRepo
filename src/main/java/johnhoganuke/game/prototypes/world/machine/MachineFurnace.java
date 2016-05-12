package johnhoganuke.game.prototypes.world.machine;

import johnhoganuke.game.prototypes.world.Machine;
import johnhoganuke.game.prototypes.ItemInt;
import johnhoganuke.game.prototypes.Recipe;

public class Machine_BasicFurnace extends Machine {   // Basic Smelting, 1 item at a time.
  name = "Basic Furnace";
  madeOf = {{Substance_Rock, 100}};
  render = E_Render.basic_furnace;
  
  int temperature = 0;
  int maxTemperature = 5000;
  int optTemperature = 3500;
  
  Ispace fuel;
  fuel.useWhitelist = true;
  fuel.whitelist = {ItemCategory_Flammable};
  fuel.maxSlots = 1;
  
  int fuelConsumption = 1;
  
  Ispace input;
  input.maxSlots = 1;
  Ispace output;
  output.maxSlots = 1;
  
  boolean consumeFuel() {
    private int fcr = fuelConsumtion;
    private int fcn = fuel.contains[0][1];
    fuel.contains[0][1] = (fuel.contains[0][1] >= fcr)?fuel.contains[0][1] - fcr;
    return (fuel.contains[0][1] < fcn)?true:false;
  }
  
  boolean consumeInput(ItemInt i) {
    private int icn = input.contains[0][1];
    input.contains[0][1] = (i[0] instanceof input.contains[0][0] && i[1] <= input.contains[0][1])?input.contains[0][1] - i[1];
    input.contains[0][0] = (input.contains[0][1] == 0)?null;
    return (icn > input.contains[0][1])?true:false;
  }
  
  boolean produceOutput(ItemInt i) {
    private int ocn = output.contains[0][1];
    output.contains = (output.contains[0][0] == null && output.contains[0][1] == 0)?i;
    return (ocn != output.contains[0][1])?true:false;
  }
  
  int doRecipes() {
    private int didRecipe = 0;
    private Recipe [] aRec = Recipe.getAll(SMELTING_BASIC);
    for (int i = 0, i == (aRec.length - 1), i++) {
      if (input.contains[0][0] instanceof aRec[i].requires[0] && input.contains >= aRec.requires[1] && this.temperature >= aRec[i].requires[2]) {
        consumeInput({aRec[i].requires[0], aRec[i].requires[1]});
        produceOutput({aRec[i].produces[0], aRec[i].produces[1]});
        didRecipe = 1;
      }
    }
    return didRecipe;
  }
  
  public static int main(String [] args) {
    this.temperature = (consumeFuel() == true)?this.temperature + 40:this.temperature - 10;
    return (doRecipes() == 1)?0:1;
  }
}
