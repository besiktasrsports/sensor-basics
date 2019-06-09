package frc.robot.sensors;

import edu.wpi.first.wpilibj.Counter;
import edu.wpi.first.wpilibj.DigitalInput;
import frc.robot.Robot;


public class LimitSwitch{


    private DigitalInput limitSwitch;
    private Counter limitSwitchCounter;
    private int limitSwitchData;
    private boolean switchFlag;

    public LimitSwitch(){

        limitSwitch = new DigitalInput(1); // Limit Switch'i RoboRIO'nun DIO pinlerinden 1 numarali pine atiyoruz.
        limitSwitchCounter = new Counter(limitSwitch);
}

    public void periodic(){

        limitSwitchData = limitSwitchCounter.get();
        if(limitSwitchData != 0){

            switchFlag = true;
            limitSwitchCounter.reset();

        }
        else {

            switchFlag = false;

        }

    }

}


    
