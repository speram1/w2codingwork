
public class Sell implements State{
    Hammer hammer;
	
	public Sell(Hammer hammer) {
		this.hammer = hammer;
	}

	@Override
	public void startstate() {
		System.out.println("Hammer is selling...");
	}

	@Override
	public void endstate() {
		System.out.println("Hammer is not selling...");

	}


}
