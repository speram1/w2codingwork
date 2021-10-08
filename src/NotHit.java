
public class NotHit implements State{
Hammer hammer;
	
	public NotHit(Hammer hammer) {
		this.hammer = hammer;
	}

	@Override
	public void startstate() {
		System.out.println("Hammer is not hitting the nail...");
	}

	@Override
	public void endstate() {
		System.out.println("Hammer is hitting the nail...");

	}


}