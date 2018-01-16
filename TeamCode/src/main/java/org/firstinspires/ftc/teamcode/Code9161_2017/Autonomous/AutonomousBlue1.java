package org.firstinspires.ftc.teamcode.Code9161_2017.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.robotcore.external.navigation.RelicRecoveryVuMark;
import org.firstinspires.ftc.teamcode.Code9161_2017.Scorpion;

@Autonomous(name="AutonomousBlue1", group="Linear OpMode")
public class AutonomousBlue1 extends LinearOpMode {

    Scorpion r = new Scorpion();

    @Override
    public void runOpMode() {
        AutoTransitioner.transitionOnStop(this, "TeleopScorpion");
        r.initRobot(hardwareMap, telemetry);

        waitForStart();

        r.relicTrackables.activate();
        r.driveLeftEncoder(.25,7);
        r.pushJewel("Blue");
        r.driveRightEncoder(.25,18);
        r.driveForwardEncoder(.25,11);
        r.turnClockwiseEncoder(.25,21);
        int pictographDistance = r.waitUntilVuMarkIsFound();
        r.driveLeftEncoder(.25,48);
        r.driveBackwardEncoder(.5,pictographDistance);
        r.turnClockwiseEncoder(.25,21);
        r.setTrayToPlace();
        r.driveBackwardEncoder(.25,3);
        r.setTrayToIntake();
    }
}