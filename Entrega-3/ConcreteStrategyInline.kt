package entregaLabo

import robocode.JuniorRobot

class ConcreteStrategyInline(robot: JuniorRobot) : Strategy(robot) {

    override fun move() {
        robot.ahead(10.0)
        robot.turnGunRight(10.0)
    }

    override fun avoid() {
        robot.turnTo(robot.heading + 180.0)
    }
}
