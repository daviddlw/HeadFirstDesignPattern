package david.headfirst.model.command;

import java.util.List;
import java.util.Arrays;

public class CommandDemoRun {
	
	/*
	 * 批量命令
	 */
	public static void marcoCommandDemoRun() {
		AirCondition airCondition = new AirCondition("daviddai");
		KitchenLight kitchenLight = new KitchenLight();
		RoomLight roomLight = new RoomLight();

		ICommand[] onCommands = new ICommand[] { new AirConditionOnCommand(airCondition),
				new KitchenLightOnCommand(new KitchenLight()), new RoomLightOnCommand(new RoomLight()) };
		ICommand[] offCommands = new ICommand[] { new AirConditionOffCommand(airCondition),
				new KitchenLightOffCommand(kitchenLight), new RoomLightOffCommand(roomLight) };
		
		MarcoCommand onMarcoCommand = new MarcoCommand(onCommands);
		onMarcoCommand.execute();
		System.out.println("------------宏命令分割--------------");
		MarcoCommand offMarcoCommand = new MarcoCommand(offCommands);
		offMarcoCommand.execute();
		System.out.println("------------撤销分割----------------");
		offMarcoCommand.undo();
	}

	/*
	 * 命令模式
	 */
	public static void commandDemoRun() {
		SimpleRemoteControl src = new SimpleRemoteControl();
		AirCondition light = new AirCondition("helloworld");
		AirConditionOnCommand lightOnCommand = new AirConditionOnCommand(light);
		AirConditionOffCommand lightOffCommand = new AirConditionOffCommand(light);
		GarageDoorUpCommand garageDoorUpCommand = new GarageDoorUpCommand(new GarageDoor());
		src.setCommand(lightOnCommand);
		src.executeCommand();
		src.setCommand(garageDoorUpCommand);
		src.executeCommand();
		src.setCommand(lightOffCommand);
		src.executeCommand();
	}

	public static void kitchenOrRoomDemoRun() {
		SimpleRemoteControl src = new SimpleRemoteControl();
		KitchenLightOnCommand klOnCommand = new KitchenLightOnCommand(new KitchenLight());

		src.setCommand(klOnCommand);
		src.executeCommand();
		src.undoCommand();

		// RoomLightOnCommand rlOnCommand = new RoomLightOnCommand(new
		// RoomLight());
		// src.setCommand(rlOnCommand);
		// src.executeCommand();
	}

	/*
	 * 命令模式完整范例
	 */
	public static void commandFullyDemoRun() {
		int count = 6;
		RemoteControl rc = new RemoteControl(count);
		List<ICommand> onButtons = Arrays.asList(new ICommand[] { new AirConditionOnCommand(new AirCondition("daviddai_on")),
				new KitchenLightOnCommand(new KitchenLight()), new RoomLightOnCommand(new RoomLight()),
				new GarageDoorUpCommand(new GarageDoor()) });
		List<ICommand> offButtons = Arrays.asList(new ICommand[] { new AirConditionOffCommand(new AirCondition("daviddai_off")),
				new KitchenLightOffCommand(new KitchenLight()), new RoomLightOffCommand(new RoomLight()),
				new GarageDoorDownCommand(new GarageDoor()) });
		for (int i = 0; i < onButtons.size(); i++) {
			rc.setCommand(i, onButtons.get(i), offButtons.get(i));
		}

		for (int i = 0; i < count; i++) {
			System.out.println("---------开启操作---------");
			rc.executeOnCommand(i);
			System.out.println("---------关闭操作---------");
			rc.executeOffCommand(i);
			System.out.println("*********************");
		}

	}

	public static void ceilFanCommandWithDetailUndoInfo() {
		int count = 3;
		RemoteControl rc = new RemoteControl(count);
		CeilingFan ceilingFan = new CeilingFan("david.dai");
		CeilFanOffCommand offCommand = new CeilFanOffCommand(new CeilingFan("davidoff"));
		rc.setCommand(0, new CeilFanHighCommand(ceilingFan), offCommand);
		rc.setCommand(1, new CeilFanLowCommand(ceilingFan), offCommand);
		rc.setCommand(2, new CeilFanMediumCommand(ceilingFan), offCommand);

		rc.executeOnCommand(0);
		rc.executeOnCommand(1);
		rc.executeUndoCommand();
	}
}
