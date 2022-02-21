package main;

import main.metamodel.Machine;
import main.metamodel.State;

public class MachineInterpreter {
	
	private Machine machine;
	private State currState;

	public void run(Machine m) {
		this.machine = m;
		currState = machine.getInitialState();
	}

	public State getCurrentState() {
		return currState;
	}

	public void processEvent(String string) {
		// TODO Auto-generated method stub
		
	}

	public int getInteger(String string) {
		return machine.getVars().get(string);
	}

}
