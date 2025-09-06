package entregaLabo;
import robocode.*;


public class EterRobot extends JuniorRobot {
	
	private Strategy strategy;
	
	public EterRobot() {
		super();
		this.strategy = new ConcreteStrategyInline(this);
	}

	@Override	
	public void run() {
		setColors(black, red, green);
		
		while (true) {
			if (this.energy < 30 || this.others > 5){
				this.setStrategy(new ConcreteStrategyInline(this));
			}
			else { 
				this.setStrategy(new ConcreteStrategyInCircles(this));
			}
			strategy.move();
		}
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	@Override
	public void onScannedRobot() {
		strategy.attack();
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	@Override
	public void onHitByBullet() {
		strategy.defend();
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	@Override
	public void onHitWall() {
		strategy.avoid();
	}	
}