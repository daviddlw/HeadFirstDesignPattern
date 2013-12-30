package david.headfirst.model.command;

/*
 * ÃüÁî½Ó¿Ú
 */
public interface ICommand {

	public CommonLogic logic = new CommonLogic();

	public void execute();

	public void undo();
}
