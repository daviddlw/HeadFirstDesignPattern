package david.headfirst.model.command;

/*
 * ����ӿ�
 */
public interface ICommand {

	public CommonLogic logic = new CommonLogic();

	public void execute();

	public void undo();
}
