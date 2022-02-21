package main.metamodel;

import java.util.ArrayList;
import java.util.List;

public class State 

{
	private String name;
	private List<Transition> trans = new ArrayList<>();
	
	public State(String name) 
	{
		this.name = name;
	}

	public Object getName() {
		return name;
	}

	public List<Transition> getTransitions() {
		return trans;
	}

	public Transition getTransitionByEvent(String string) {
		return trans.stream().filter(trans -> trans.getEvent() == string).findFirst().orElse(null);
	}

}
