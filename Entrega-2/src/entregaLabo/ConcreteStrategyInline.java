package entregaLabo;

import robocode.JuniorRobot;

public class ConcreteStrategyInline extends Strategy{

	public ConcreteStrategyInline(JuniorRobot robot) {
		super(robot);
	}
	
	@Override
	public void move() {
		robot.ahead(10);
		robot.turnGunRight(10);
	}
	
	@Override
	public void avoidWall() {
		robot.turnTo(robot.heading+180);
	}
	
	@Override
	public void avoidRobot() {
		 robot.turnRight(90); // Gira rápidamente para cambiar de dirección
		 robot.back(50); // Retrocede para crear distancia
		 robot.turnRight(45); // Gira adicionalmente para seguir en línea
		 robot.ahead(100); // Avanza nuevamente
	}
}
