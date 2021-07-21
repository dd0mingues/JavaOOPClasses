package inheratanceExercice;

public interface OperateVehiacle {
	public void moveFoward(int speed);
	public void moveBackward(int speed);
	public void accelerate(int metersPerSecond);
	public void turnRight();
	public void turnLeft();
	public void stop(boolean breakHard);
	public void park();
}
