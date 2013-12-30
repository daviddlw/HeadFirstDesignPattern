package david.headfirst.model.command;

/*
 * 命令模式中命令发起者
 */
public class SimpleRemoteControl {
	ICommand command;
	
	public SimpleRemoteControl() {
		// TODO Auto-generated constructor stub
	}
	
	public void setCommand(ICommand command) {
		this.command = command;
	}
	
	public void executeCommand() {
		command.execute();
	}
	
	public void undoCommand() {
		command.undo();
	}
}
