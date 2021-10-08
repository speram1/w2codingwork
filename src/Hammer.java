import java.util.List;

public class Hammer {
	State bought;
	State sold;
	State hit;
	State nothit;

	State state;

	String name;
	List<String> states;
	public Hammer() {
		bought = new Buy(this);
		sold = new Sell(this);
		hit = new Hit(this);
		nothit = new NotHit(this);		
	}
	
	void addItems(List<String> state) {
		this.states = state;
	}
 
	public void setName(String name) {
		this.name = name;
	}
	
	void create() {
		System.out.println( name + ".......");
		for (String st : states) {
			System.out.println("   " + st);
		}
	}

	public void stateStart()
	{
		state.startstate();
	}
	public void stateEnd()
	{
		state.endstate();
	}
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public State getBought() {
		return bought;
	}

	public State getSold() {
		return sold;
	}

	public State getHit() {
		return hit;
	}

	public State getNothit() {
		return nothit;
	}

}
