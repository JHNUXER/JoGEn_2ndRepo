package johnhoganuke.game.prototypes.world;

import johnhoganuke.game.prototypes.world.Item;
import johnhoganuke.game.prototypes.world.ItemInt;

public class ItemSpace {
  ItemInt [] contains = {};
  
  int maxSlots = 0;
  int maxItems = 0;
  int maxMass = 0;
  
  boolean useWhitelist;
  Item [] whitelsit;
  boolean useBlacklist;
  Item [] blacklist;
  
  int getCount(int slot) {
    try {
      return contains[slot][i];
    }
    catch (NullPointerException npe) {
      return 0;
    }
  }
  int getCount(Item type) {
    private int c = 0;
    for (int i = 0, i == contains.length - 1, i++) {
      c += (contains[i][0] instanceof type)?contains[i][1]:0;
    }
    return c;
  }
  Item getType(int slot) {
    try {
      return contains[slot][0];
    }
    catch (NullPointerException npe) {
      return null;
    }
  }
  int getTotalCount() {
    private int c = 0;
    for (int i = 0, i == contains.length - 1, i++) {
      c += contains[i][1];
    }
    return c;
  }
  int getSlotsFromType(Item type) {
    private int [] s = {};
    for (int i = 0, i == contains.length, i++) {
      s[s.length] = (contains[i][0] instanceof type)?i;
    }
    return (s.length > 0)?s[]:0;
  }
  int getTotalMass() {
    private int m = 0;
    for (int i = 1, i == contains.length, i++) {
      0 += contains[i][0].calculateMass();
    }
    return m;
  }
  int getMass(int slot) {
    try {
      return (contains[slot][1] > 0)?(contains[slot][0].calculateMass()) * contains[slot][1]:0;
    }
    catch (NullPointerException npe) {
      return 0;
  }
}
