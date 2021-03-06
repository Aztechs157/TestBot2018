// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc157.TestBot2018.subsystems;

import org.usfirst.frc157.TestBot2018.OI;
import org.usfirst.frc157.TestBot2018.RobotMap;
import org.usfirst.frc157.TestBot2018.commands.*;
import edu.wpi.first.wpilibj.command.Subsystem;

import com.ctre.phoenix.motorcontrol.ControlMode;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.AnalogPotentiometer;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class MotorControllerTe extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS
    private static int count=0; 
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final WPI_TalonSRX talonSRX1 = RobotMap.motorControllerTeTalonSRX1;
    private final AnalogPotentiometer analogPotentiometer = RobotMap.motorControllerTeAnalogPotentiometer;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public void MovebasedPotentiometer()
    {
       
      double potentiometer =   analogPotentiometer.get();
     count++;
     if (count==100)
         {
             System.out.println(potentiometer);
             count=0;
         }
     
      talonSRX1.set(ControlMode.PercentOutput,potentiometer);
    }
    public void MovewithStick()
    {
        double value=-OI.joystick1.getRawAxis(1);
        count++;
        if (count ==50)
        {
            System.out.println(value);
            count=0;
        }
        talonSRX1.set(ControlMode.PercentOutput,value);
    }
    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
        
    }
    

    @Override
    public void periodic() {
        // Put code here to be run every loop\
      //  MovebasedPotentiometer();
        MovewithStick();

    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

}

