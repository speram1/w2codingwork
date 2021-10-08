
public class Buy implements State{

Hammer hammer;
	
	public Buy(Hammer hammer) {
		this.hammer = hammer;
	}

	@Override
	public void startstate() {
		System.out.println("Hammer is buying...");
	}

	@Override
	public void endstate() {
		System.out.println("Hammer is not buying...");

	}


}