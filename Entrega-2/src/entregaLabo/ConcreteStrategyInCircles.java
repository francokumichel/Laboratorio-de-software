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
	public void avoidWall() {
		robot.turnRight(10);
		robot.ahead(10);
	}
	
	@Override
	public void avoidRobot() {
		robot.turnRight(45); // Gira a la derecha rápidamente
	    robot.back(100); // Retrocede para alejarse del robot enemigo
	    robot.turnRight(90); // Gira nuevamente para seguir en círculo
	    robot.ahead(150); // Avanza hacia adelante para retomar su trayectoria
	}
	
}
