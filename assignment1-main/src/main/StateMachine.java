package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import main.metamodel.Machine;
import main.metamodel.State;
import main.metamodel.Transition;

public class StateMachine {
	
	private final List<State> states = new ArrayList<>();
	private final Map<String, Integer> ints = new HashMap<>();
	private State initial;
	private String currEvent;
	private State currState;


	public Machine build() {
		return new Machine(states, initial, ints);
	}

	public StateMachine state(String string) {
		states.stream().filter(state -> state.getName() == string).findFirst().ifPresentOrElse(state -> this.currState = state, () -> states.add(this.currState = new State(string)));
		return this;
	}

	public StateMachine initial() {
		initial = states.get(states.size() - 1);
		return this;
	}

	public StateMachine when(String event) {
		currEvent = event;
		return this;
	}
	public StateMachine to(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine integer(String string) {
		ints.put(string, 0);
		return this;
	}

	public StateMachine set(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine increment(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine decrement(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine ifEquals(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine ifGreaterThan(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine ifLessThan(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
