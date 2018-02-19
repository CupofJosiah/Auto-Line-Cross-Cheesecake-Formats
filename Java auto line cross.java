import edu.wpi.first.wpilibj.Timer; //This imports the code needed to use a timer

public void autonomousInit() {
	public Timer crossTimer = new Timer(); //This creates the timer
}

public void autonomousPeriodic() {
	if (crossTimer < /*put however long it takes to cross here in seconds*/)
	{//this sets the motors to go forward if the time is less than what was put in the if statement
		
		// instead of using drivetrainmotor1 and drivetrainmotor2 use whatever you named the motors you drive with
		drivetrainmotor1.set(0.6f);
		drivetrainmotor2.set(0.6f);
		//do this for as many motors as there are on the drivetrain
		//one or more of your motor outputs may need to be inverted(ie put a - in front of the number); do this if this makes it turn
		
		
	}else{
		//this will make the robot stop driving if it has been longer than the time in the if statement
		drivetrainmotor1.set(0);
		drivetrainmotor2.set(0);
		
	}
}