/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.sensors;

import edu.wpi.first.wpilibj.AnalogInput;

/**
 * Add your docs here.
 */
public class Ultrasonic {

    private AnalogInput ultrasonic;
    private double ultrasonicValue;

    public Ultrasonic(){

        ultrasonic = new AnalogInput(1); // RoboRIO'nun 1 numarali analog pinine tanimliyoruz.

    }

    public double getUltrasonicValue(){

        double averageVoltage = ultrasonic.getAverageVoltage();
        double fixedAverageVoltage = averageVoltage*1000;

        ultrasonicValue = fixedAverageVoltage/4.9; // 4.9 ultrasonik sensorumuzun calisma voltaji

        return ultrasonicValue;



    }

}
