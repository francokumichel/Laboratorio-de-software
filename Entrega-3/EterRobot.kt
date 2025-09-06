package entregaLabo

import robocode.*

class EterRobot : JuniorRobot() {

    private var strategy: Strategy = ConcreteStrategyInline(this)

    override fun run() {
        setColors(black, red, green)

        while (true) {
            strategy = if (this.energy < 30 || this.others > 5) {
                ConcreteStrategyInline(this)
            } else {
                ConcreteStrategyInCircles(this)
            }
            strategy.move()
        }
    }

    fun setStrategy(strategy: Strategy) {
        this.strategy = strategy
    }

    override fun onScannedRobot() {
        strategy.attack()
    }

    override fun onHitByBullet() {
        strategy.defend()
    }

    override fun onHitWall() {
        strategy.avoid()
    }
}
