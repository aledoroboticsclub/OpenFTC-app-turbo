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
        r.initVuforia();//starts vuforia
        AutoTransitioner.transitionOnStop(this, "TeleopScorpion");

        waitForStart();

        r.waitUntilVuMarkIsFound();
        r.deactivateVuforia();
        r.driveForwardTime(.5,500);
        r.initJewelDetector();//starts dogeCV
        while(opModeIsActive()){
            //r.displayJewelResults();
            telemetry.addData("Jewel Order: ", r.jewelDetector.getCurrentOrder().toString());
            telemetry.update();
        }
        r.jewelDetector.disable();
        /*r.turnAbsolute(90,1);
        r.turnAbsolute(-90,1);*/
    }
}