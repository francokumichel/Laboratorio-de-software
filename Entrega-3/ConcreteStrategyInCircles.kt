package entregaLabo

import robocode.JuniorRobot

class ConcreteStrategyInCircles(robot: JuniorRobot) : Strategy(robot) {

    override fun move() {
        robot.ahead(600.0)
        robot.bearGunTo(90)
    }

    override fun avoid() {
        robot.turnRight(10.0)
        robot.ahead(10.0)
    }
}
