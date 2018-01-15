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

        /*r.driveLeftEncoder(1,6);
        r.pushJewel("Blue");
        r.driveBackwardEncoder(1,12);
        r.turnCounterwiseEncoder(1,12);*/
        r.driveForwardEncoder(.5,12);

        RelicRecoveryVuMark vuMark=r.waitUntilVuMarkIsFound();

        telemetry.addData("Vumark: ",vuMark);
        r.waiter(500);
        if(vuMark!=RelicRecoveryVuMark.UNKNOWN)
            r.driveBackwardEncoder(.5,12);
        /*r.driveBackwardEncoder(1,18 );
        r.turnClockwiseEncoder(1,12);
        r.driveForwardEncoder(1,36);
        r.setLiftToPosition0();*/
    }
}