package frc.robot.sensors;

import edu.wpi.first.wpilibj.BuiltInAccelerometer;
import edu.wpi.first.wpilibj.interfaces.Accelerometer;
import frc.robot.Robot;


public class AccelerometerExample
{

    private static Accelerometer accel;
    private static double xVal;
    private static double yVal;
    private static double zVal;

    public AccelerometerExample(){

     accel = new BuiltInAccelerometer();
     accel = new BuiltInAccelerometer(Accelerometer.Range.k4G);

    }

    public static void printAccelerometerValues(){

        xVal = accel.getX();
        yVal = accel.getY();
        zVal = accel.getZ();

        System.out.println("X Value : "+ xVal + "Y Value : "+ yVal + "Z Value : "+ zVal);

    }


}