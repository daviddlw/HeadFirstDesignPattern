package david.headfirst.model.command;

public class RemoteControl {
	private ICommand[] onCommands;
	private ICommand[] offCommands;
	private ICommand undoCommand;

	public RemoteControl(int num) {
		onCommands = new ICommand[num];
		offCommands = new ICommand[num];
		
		NoCommand noCommand = new NoCommand();
		for (int i = 0; i < num; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}

	public void setCommand(int slot, ICommand on, ICommand off) {
		onCommands[slot] = on;
		offCommands[slot] = off;
	}
	
	public void name(int slot, ICommand command) {
		onCommands[slot] = command;
	}

	public void executeOnCommand(int slot) {
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}

	public void executeOffCommand(int slot) {
		offCommands[slot].execute();
		undoCommand = onCommands[slot];
	}
	
	public void executeUndoCommand() {
		undoCommand.undo();
	}
}

class NoCommand implements ICommand {

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("No Command");
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		System.out.println("No Command");
	}
}
