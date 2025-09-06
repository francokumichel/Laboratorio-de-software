package entregaLabo;

import robocode.JuniorRobot;

public abstract class Strategy implements RobotActions{
	protected JuniorRobot robot;
	
	public Strategy(JuniorRobot robot) {
		super();
		this.robot = robot;
	}
	
	@Override
	public abstract void move();
	
	@Override
	public abstract void avoidRobot();
	
	@Override
	public void attack() {
		robot.turnGunTo(robot.scannedAngle);
		if (robot.energy>25) {
			robot.fire(3);
		}
		else
			robot.fire (1);
		robot.ahead(10);
	}
	
	@Override
	public void defend() {
		robot.ahead(10);
	}
	
	@Override
	public void avoidWall() {
		robot.turnRight(10);
		robot.ahead(10);
	}
	
}
