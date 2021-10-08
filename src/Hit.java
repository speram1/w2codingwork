
public class Hit implements State{

Hammer hammer;
	
	public Hit(Hammer hammer) {
		this.hammer = hammer;
	}

	@Override
	public void startstate() {
		System.out.println("Hammer is hitting the nail...");
	}

	@Override
	public void endstate() {
		System.out.println("Hammer is not hitting the nail...");

	}


}