package org.firstinspires.ftc.teamcode.Code2018.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.Code2018.Scorpion;

@Autonomous(name="AutonomousBlue2", group="Linear OpMode")
//@Disabled

public class AutonomousBlue2 extends LinearOpMode {
    Scorpion r = new Scorpion();
    int a = 0;
    @Override
    public void runOpMode() {
        AutoTransitioner.transitionOnStop(this, "TeleopScorpion");
        r.initRobot(hardwareMap, telemetry);

        waitForStart();

        r.relicTrackables.activate();

        r.pushJewel("Blue");

//        r.turnClockwiseEncoder(.25,21);
//        int pictographDistance = r.waitUntilVuMarkIsFound();
//        r.driveLeftEncoder(.25,48);
//        r.driveBackwardEncoder(.5,pictographDistance);
//        r.turnClockwiseEncoder(.25,21);
//        r.setTrayToPlace();
//        r.driveBackwardEncoder(.25,3);
//        r.setTrayToIntake();
    }
}