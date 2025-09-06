package entregaLabo;

import robocode.JuniorRobot;

public interface StrategySelector {
	RobotActions getStrategy(JuniorRobot robot);
}
