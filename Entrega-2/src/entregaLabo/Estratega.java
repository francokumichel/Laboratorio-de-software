package entregaLabo;
import robocode.JuniorRobot;

public class Estratega {
	
	public static StrategySelector estratega1= new Estratega1();
	public static StrategySelector estratega2= new Estratega2();
	
	private static class Estratega1 implements StrategySelector{
		
		@Override
		public RobotActions getStrategy(JuniorRobot robot) {
			if (robot.energy < 30 || robot.others > 5){
				return new ConcreteStrategyInCircles(robot);
			}
			else { 
				return new ConcreteStrategyInline(robot);
			}
		}
		
	}
	
	private static class Estratega2 implements StrategySelector{

		@Override
		public RobotActions getStrategy(JuniorRobot robot) {
			if (robot.others > 2 && robot.energy > 15) {
				return new ConcreteStrategyInCircles(robot);
			}
			else {
				return new ConcreteStrategyInline(robot);
			}
		}
		
	}
}
