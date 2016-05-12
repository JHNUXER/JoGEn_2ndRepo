package johnhoganuke.game.protoytpes.world;

import johnhoganuke.game.world.Item;
import johnhoganuke.jogen.prototypes.Pos;

public class Gobject extends Item {
  Pos position;
  
  Item toItem(Gobject g) {
    return new Item(g.name, g.madeOf[], g.render);
  }
  void toItem(Gobject g) {
    this = new Item(this.name, this.madeOf[], this.render);
  }
}
