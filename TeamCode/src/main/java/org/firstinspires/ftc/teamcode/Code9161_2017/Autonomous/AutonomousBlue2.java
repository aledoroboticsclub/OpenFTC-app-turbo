package org.firstinspires.ftc.teamcode.Code9161_2017.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;
import com.qualcomm.robotcore.util.RobotLog;

import org.firstinspires.ftc.robotcore.external.matrices.OpenGLMatrix;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaLocalizer;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaTrackable;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaTrackableDefaultListener;
import org.firstinspires.ftc.teamcode.Code9161_2017.Scorpion;

@Autonomous(name="AutonomousBlue2", group="Linear OpMode")
public class AutonomousBlue2 extends LinearOpMode {
    Scorpion r = new Scorpion();
    int a = 0;
    @Override
    public void runOpMode() {
        waitForStart();
        r.driveLeftEncoder(1,6);
        r.pushJewel("Blue");
        r.driveBackwardEncoder(1,12);
        r.turnClockwiseEncoder(1,12);
        a = r.decodePictograph();
        r.driveRightEncoder(1,24 + a);
        r.setLiftToPosition0();
    }
}