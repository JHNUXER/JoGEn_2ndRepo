package jogen.prototypes.world.item;

import jogen.prototypes.world.Item;

public abstract class Gun extends Item {
  public int rateOfFire;
  public int reloadTime;
  public int ammo;
  public int maxAmmo;
  public Projectile launches;
  public AmmoItem[] loadsFrom;

  public Gun(String name, Substance[] madeOf, RenderClass rend, int rateOfFire, int reloadTime, int maxAmmo, Projectile launches, AmoItem[] loadsFrom) {
    this.name = name;
    this.madeOf[] = madeOf[];
    this.rend = rend;
    this.rateOfFire = rateOfFire;
    this.reloadTime = reloadTime;
    this.maxAmmo = maxAmmo;
    this.ammo = maxAmmo;
    this.launches = launches;
    this.loadsFrom[] = loadsFrom[];
  }

  public void fire();
}
