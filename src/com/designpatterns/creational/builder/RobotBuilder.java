package com.designpatterns.creational.builder;

/**
 * Pattern used to create objects made from a bunch of other objects -
 * <ul>
 * <li>When you want to build an object made up from other objects</li>
 * <li>When you want the creation of these parts to be independent of
 * the main object.</li>
 * <li>Hide the creation of the parts from the client so both are not
 * dependent.</li>
 * <li> The builder knows the specific and nobody else does</li>
 * </ul> 
 * @author apal
 *
 */
public class RobotBuilder implements IRobotBuilder {

  private Robot robot;
  
  public RobotBuilder() {
    this.robot = new Robot();
  }

  @Override
  public void buildRobotHead() {
    robot.setRobotHead("Tin head");
  }

  @Override
  public void buildRobotTorso() {
    robot.setRobotTorso("Tin Torso");
  }

  @Override
  public void buildRobotArms() {
    robot.setRobotArms("Blowtorch Arms");
  }

  @Override
  public void buildRobotLegs() {
    robot.setRobotLegs("Roller Skates");
  }
}
