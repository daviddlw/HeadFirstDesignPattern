package david.headfirst.model.status;

public interface IState {
	/*
	 * ����Ӳ��
	 */
	public void insertQuarter();
	
	/*
	 * �˳�Ӳ��
	 */
	public void ejectQuarter();
	
	/*
	 * ת���ֱ�
	 */
	public void turnCrank();
	
	/*
	 * �����ǹ�
	 */
	public void dispense();
	
	/*
	 * ��������ǹ�
	 */
	public void refill(int count);
}
