package entregaLabo;
import robocode.*;


public class EterRobot extends JuniorRobot {
	
	public StrategySelector estratega= Estratega.estratega1;
	
	public EterRobot() {
		super();
	}

	@Override	
	public void run() {
		setColors(black, red, green);
		
		while (true) {
			estratega.getStrategy(this).move();
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	@Override
	public void onScannedRobot() {
		estratega.getStrategy(this).attack();
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	@Override
	public void onHitByBullet() {
		estratega.getStrategy(this).defend();
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	@Override
	public void onHitWall() {
		estratega.getStrategy(this).avoidWall();
	}
	
	@Override
	public void onHitRobot() {
		estratega.getStrategy(this).avoidRobot();
	}
}