package org.firstinspires.ftc.teamcode.Code2018.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.Code2018.Scorpion;

/**
 * Created by jreynoldsstudent on 1/4/2018.
 */
//@Disabled

@Autonomous(name="AutoTester", group="Linear Opmode")
public class AutoTester extends LinearOpMode {
    Scorpion r = new Scorpion();
    @Override
    public void runOpMode() {
        r.initRobot(hardwareMap, telemetry);
        r.initGyro();

        /*//To test gyro
        while(opModeIsActive()){
            telemetry.addData("RevHub1 Angle", r.getGyroAvgZ());
        }*/











        //To test phone position for DogeCV
        //AutoTransitioner.transitionOnStop(this, "TeleopScorpion");

        r.initJewelDetector();//starts dogeCV
        r.waiter(1000);
        r.phoneServo.setPosition(.65);//need to test

        waitForStart();

        while(opModeIsActive()){
            telemetry.addData("Jewel Order: ", r.jewelDetector.getCurrentOrder().toString());
            telemetry.update();
        }
        r.jewelDetector.disable();
    }
}