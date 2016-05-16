package game.data.world.item.gun;

import java.atw.event.KeyEvent;

public class Gun_DubstepGun extends Gun {
  name = "Bass Cannon";
  
  public 
  public boolean loaded = false;
  public Sound songSelect;
  int force = 0;
  int maxForce = 20;
  
  public void charge() {
    while (force < maxForce) {
      force += (force < maxForce)?1;
      wait(0.5);
    }
  }
  public void hold() {
    private int f = force;
    force = f;
    Projectile.fire(this, new SoundProjectile(this.songSelect))
  }
  public void use() {
    private boolean shift = KeyEvent.isShiftDown();
    if (shift) {
      charge();
      do {
        hold();
      } while (KeyEvent.isShiftDown());
    }
  }
  public void load(AmmoItem i) {
    try {
      songSelect = i.sound;
    }
    catch (Exception e) {
      return;
    }
  }
}
