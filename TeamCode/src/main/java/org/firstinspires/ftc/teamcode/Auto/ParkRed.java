package org.firstinspires.ftc.teamcode.Auto;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.acmerobotics.dashboard.FtcDashboard;
import com.acmerobotics.dashboard.telemetry.TelemetryPacket;
import com.acmerobotics.roadrunner.SequentialAction;
import com.acmerobotics.roadrunner.Vector2d;
import com.acmerobotics.roadrunner.ftc.Actions;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import org.firstinspires.ftc.teamcode.Auto.Drive;
import org.firstinspires.ftc.teamcode.MecanumDrive;
import org.firstinspires.ftc.teamcode.stuff.Globals;
import org.firstinspires.ftc.teamcode.stuff.Location;

@Autonomous(name = "ParkRed", preselectTeleOp = "IntoTheDeepTele")
public class ParkRed extends LinearOpMode {
    public void runOpMode() throws InterruptedException{
        Globals.ALLIANCE = Location.RED;
        Drive drive = new Drive(hardwareMap, 36, 61, Math.toRadians(90));

        if(opModeIsActive()) {
            Actions.runBlocking(
                    //"SEQUENTIAL ACTION" RUNS ALL COMMANDS ONE AT A TIME
                    new SequentialAction(
                            //CALLS "TAPEPIXEL" METHOD IN "DRIVE.JAVA" CLASS
                            //FEEDS IT TWO VARIABLES: THE TARGET TAPE POSITION AND HOW MUCH TO ROTATE
                            drive.toPark()
                    )
            );
        }
    }

}

