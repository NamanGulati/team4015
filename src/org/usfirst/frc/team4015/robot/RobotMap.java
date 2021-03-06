package org.usfirst.frc.team4015.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	
	public static class Pwm {
		public static final int FrontLeftDrive = 3;
		public static final int RearLeftDrive = 2;
		public static final int FrontRightDrive = 1;
		public static final int RearRightDrive = 0;
		public static final int LauncherArm = 5;
		public static final int FrontServo = 6;
		public static final int BackServo = 7;
	}
	
	// Analog Inputs
	public static class Analog {
		public static final int Gyro = 0;
	}
	
	public static class DigitalIn {
		public static final int ReedSwitch0 = 0;
		public static final int DI2 = 2;
		public static final int DI4 = 4;
	}
	
	public static class DigitalOut {
		public static final int DO1 = 1;
		public static final int DO3 = 3;
	}
}
