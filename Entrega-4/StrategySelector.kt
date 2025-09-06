package entregaLabo

import robocode.JuniorRobot

interface StrategySelector {
    fun getStrategy(robot: JuniorRobot): RobotActions
}
