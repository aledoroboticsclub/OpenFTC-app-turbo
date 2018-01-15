package org.firstinspires.ftc.teamcode.Code9161_2017.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
 * Created by jreynoldsstudent on 1/4/2018.
 */
@TeleOp(name="VuforiaTester", group="Linear Opmode")
//@Disabled
public class VuforiaTester extends LinearOpMode {
    int a = 1;
    @Override
    public void runOpMode() {
       // r.initRobot(hardwareMap, telemetry);

        waitForStart();

        if(a==0){
            //r.driveForwardEncoder(1,12);
            telemetry.addData("Vumark", "Left");
        }
        else if(a==6){
           // r.driveRightEncoder(1,12);
            telemetry.addData("Vumark", "Center");
        }
        else if(a==12){
           // r.driveBackwardEncoder(1,12);
            telemetry.addData("Vumark", "Right");
        }

    }
}