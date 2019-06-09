/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.sensors;
import com.kauailabs.navx.frc.AHRS;
/**
 * Add your docs here.
 */
public class navxGyroscopeExample {
public static AHRS ahrs;
public static double yaw;


public navxGyroscopeExample(){
       ahrs = new AHRS(SPI.Port.kMXP);
    }

public double yawValue(){
    yaw = ahrs.getYaw();
    return yaw;
}
}

