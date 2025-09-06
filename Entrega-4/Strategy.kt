package entregaLabo

import robocode.JuniorRobot

abstract class Strategy(protected val robot: JuniorRobot) : RobotActions {
    
    override fun attack() {
        robot.turnGunTo(robot.scannedAngle)
        if (robot.energy > 25) {
            robot.fire(3.0)
        } else {
            robot.fire(1.0)
        }
        robot.ahead(10)
    }

    override fun defend() {
        robot.ahead(10)
    }

    override fun avoidWall() {
        robot.turnRight(10)
        robot.ahead(10)
    }
}
