package org.firstinspires.ftc.teamcode.Code2018.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.robotcore.external.navigation.RelicRecoveryVuMark;
import org.firstinspires.ftc.teamcode.Code2018.Scorpion;

@Autonomous(name="AutonomousBlue2", group="Linear OpMode")
//@Disabled

public class AutonomousBlue2 extends LinearOpMode {
    Scorpion r = new Scorpion();
    int pictographDistance = 0;
    @Override
    public void runOpMode() {
        AutoTransitioner.transitionOnStop(this, "TeleopScorpion");
        r.initRobot(hardwareMap, telemetry);
        r.initJewelDetector();
        r.waiter(2500);

        waitForStart();

        r.setJewelPusherToDown();
        r.driveRightEncoder(.1,3);
        r.waiter(1000);
        r.setPhoneToJewelPosition();
        r.pushJewel("Blue");
        r.setPhoneToUpPosition();
        r.jewelDetector.disable();
        //r.driveLeftEncoder(.25,40);
        //r.initVuforia();
        //RelicRecoveryVuMark pictograph = r.waitUntilVuMarkIsFound();
        //telemetry.addData("VuMark: ",pictograph);
//        r.driveLeftEncoder(.25,48);
//        if(pictograph.equals(RelicRecoveryVuMark.CENTER))
//            pictographDistance = 7;
//        if(pictograph.equals(RelicRecoveryVuMark.RIGHT))
//            pictographDistance = 14;
//        r.driveBackwardEncoder(.5,pictographDistance);
//        r.turnClockwiseEncoder(.25,21);
//        r.setTrayToPlace();
//        r.driveBackwardEncoder(.25,3);
//        r.setTrayToIntake();
    }
}