package org.firstinspires.ftc.teamcode.Code9161_2017.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.Code9161_2017.Scorpion;

/**
 * Created by jreynoldsstudent on 1/4/2018.
 */
@Autonomous(name="AutoTester", group="Linear Opmode")
public class AutoTester extends LinearOpMode {
    Scorpion r = new Scorpion();
    @Override
    public void runOpMode() {
        r.initRobot(hardwareMap, telemetry);
        AutoTransitioner.transitionOnStop(this, "TeleopScorpion");

        waitForStart();

        r.driveForwardTime(.25,500);
        r.driveBackwardTime(.25,500);
        r.driveLeftTime(.25,500);
        r.driveRightTime(.25,500);
        r.driveCounterwiseTime(.25,500);
        r.driveClockwiseTime(.25,500);
    }
}
