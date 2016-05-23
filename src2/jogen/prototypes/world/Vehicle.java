package jogen.prototypes.world;

public abstract class Vehicle {
  String name;
  public Pos position;
  public Pos velocities;
  public int maxVelocity;
  Gobject[] parts;
  
  public Vehicle() {
    
  }
}
