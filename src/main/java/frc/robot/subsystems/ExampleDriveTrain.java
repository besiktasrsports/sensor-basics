/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class ExampleDriveTrain extends Subsystem {
  public static WPI_TalonSRX exampleLeftTalon;
  public static WPI_TalonSRX exampleRightTalon;
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
public ExampleDriveTrain(){

  exampleLeftTalon = new WPI_TalonSRX(14); //ID's are random.
  exampleRightTalon = new WPI_TalonSRX(15);

}
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
