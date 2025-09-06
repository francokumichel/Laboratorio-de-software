package entregaLabo

import robocode.JuniorRobot

object Estratega {
    val estratega1: StrategySelector = Estratega1()
    val estratega2: StrategySelector = Estratega2()

    private class Estratega1 : StrategySelector {
        override fun getStrategy(robot: JuniorRobot): RobotActions {
            return if (robot.energy < 30 || robot.others > 5) {
                ConcreteStrategyInCircles(robot)
            } else {
                ConcreteStrategyInline(robot)
            }
        }
    }

    private class Estratega2 : StrategySelector {
        override fun getStrategy(robot: JuniorRobot): RobotActions {
            return if (robot.others > 2 && robot.energy > 15) {
                ConcreteStrategyInCircles(robot)
            } else {
                ConcreteStrategyInline(robot)
            }
        }
    }
}
