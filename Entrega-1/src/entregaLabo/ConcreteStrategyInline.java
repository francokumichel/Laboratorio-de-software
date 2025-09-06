package entregaLabo;

import robocode.JuniorRobot;

public class ConcreteStrategyInline extends Strategy{

	public ConcreteStrategyInline(JuniorRobot robot) {
		super(robot);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void move() {
		robot.ahead(10);
		robot.turnGunRight(10);
	}
	
	@Override
	public void avoid() {
		robot.turnTo(robot.heading+180);
	}
	
}
