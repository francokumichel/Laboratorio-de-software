package entregaLabo;

import robocode.JuniorRobot;

public class ConcreteStrategyInCircles extends Strategy{
	
	
	public ConcreteStrategyInCircles(JuniorRobot robot) {
		super(robot);
	}

	@Override
	public void move() {
		robot.ahead(600);
		robot.bearGunTo(90);
	}

	@Override
	public void avoid() {
		robot.turnRight(10);
		robot.ahead(10);
	}
	
}
