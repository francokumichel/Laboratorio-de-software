package entregaLabo

import robocode.JuniorRobot

class ConcreteStrategyInline(robot: JuniorRobot) : Strategy(robot) {

    override fun move() {
        robot.ahead(10)
        robot.turnGunRight(10)
    }

    override fun avoidWall() {
        robot.turnTo(robot.heading + 180)
    }

    override fun avoidRobot() {
        robot.turnRight(90)
        robot.back(50)
        robot.turnRight(45)
        robot.ahead(100)
    }
}
