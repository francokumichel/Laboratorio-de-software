package entregaLabo
import robocode.*

class EterRobot : JuniorRobot() {
    
    var estratega: StrategySelector = Estratega.estratega1

    override fun run() {
        setColors(black, red, green)

        while (true) {
            estratega.getStrategy(this).move()
        }
    }

    override fun onScannedRobot() {
        estratega.getStrategy(this).attack()
    }

    override fun onHitByBullet() {
        estratega.getStrategy(this).defend()
    }

    override fun onHitWall() {
        estratega.getStrategy(this).avoidWall()
    }

    override fun onHitRobot() {
        estratega.getStrategy(this).avoidRobot()
    }
}
