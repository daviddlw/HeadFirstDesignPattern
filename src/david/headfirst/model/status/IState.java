package david.headfirst.model.status;

public interface IState {
	/*
	 * 插入硬币
	 */
	public void insertQuarter();
	
	/*
	 * 退出硬币
	 */
	public void ejectQuarter();
	
	/*
	 * 转动手柄
	 */
	public void turnCrank();
	
	/*
	 * 分配糖果
	 */
	public void dispense();
	
	/*
	 * 重新填充糖果
	 */
	public void refill(int count);
}
