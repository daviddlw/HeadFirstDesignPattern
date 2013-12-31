package david.headfirst.model.command;

/*
 * ∫Í√¸¡Ó
 */
public class MarcoCommand implements ICommand {
	
	private ICommand[] commands;
	
	public MarcoCommand(ICommand[] commands) {
		this.commands = commands;
	}
	
	@Override
	public void execute() {
		for (int i = 0; i < commands.length; i++) {
			commands[i].execute();
		}
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		for (int i = 0; i < commands.length; i++) {
			commands[i].undo();
		}
	}

}
