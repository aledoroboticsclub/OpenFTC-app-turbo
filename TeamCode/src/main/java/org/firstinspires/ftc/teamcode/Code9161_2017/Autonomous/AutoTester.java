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

        /*r.turnAbsolute(90,1);
        r.turnAbsolute(-90,1);*/
    }
}
