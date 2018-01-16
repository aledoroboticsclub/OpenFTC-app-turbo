package org.firstinspires.ftc.teamcode.Code9161_2017.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Code9161_2017.Scorpion;

/**
 * Created by jreynoldsstudent on 1/4/2018.
 */
@TeleOp(name="VuforiaTester", group="Linear Opmode")
//@Disabled
public class VuforiaTester extends LinearOpMode {
    int a = 1;
    Scorpion r=new Scorpion();
    @Override
    public void runOpMode() {
        r.initRobot(hardwareMap, telemetry);

        waitForStart();

        r.turnClockwiseEncoder(.25,21);
    }
}