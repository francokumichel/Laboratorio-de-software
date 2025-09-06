package entregaLabo

import robocode.JuniorRobot

class ConcreteStrategyInCircles(robot: JuniorRobot) : Strategy(robot) {

    override fun move() {
        robot.ahead(600)
        robot.bearGunTo(90)
    }

    override fun avoidWall() {
        robot.turnRight(10)
        robot.ahead(10)
    }

    override fun avoidRobot() {
        robot.turnRight(45)
        robot.back(100)
        robot.turnRight(90)
        robot.ahead(150)
    }
}
