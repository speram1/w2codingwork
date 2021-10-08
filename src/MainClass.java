
public class MainClass {

	public static void main(String[] args) {
		HammerBuilder hb = new Ballpeen();
		Hammer h = hb.startcreation().endcreation().build();
		h.create();
		h.setState(new Sell(h));
		h.stateStart();
		h.stateEnd();
		
		h.setState(new Buy(h));
		h.stateStart();
		h.stateEnd();
		
		h.setState(new Hit(h));
		h.stateStart();
		h.stateEnd();
		
		
		HammerBuilder hb1 = new Club();
		Hammer h1 = hb1.startcreation().endcreation().build();
		h1.create();
		h1.setState(new Sell(h1));
		h1.stateStart();
		h1.stateEnd();
		
		h1.setState(new Buy(h1));
		h1.stateStart();
		h1.stateEnd();
		
		h1.setState(new Hit(h1));
		h1.stateStart();
		h1.stateEnd();
		HammerBuilder hb2 = new Claw();
		Hammer h2 = hb2.startcreation().endcreation().build();
		h2.create();
		h2.setState(new Sell(h2));
		h2.stateStart();
		h2.stateEnd();
		
		h2.setState(new Buy(h2));
		h2.stateStart();
		h2.stateEnd();
		
		h2.setState(new Hit(h2));
		h2.stateStart();
		h2.stateEnd();
		
		h2.setState(new NotHit(h2));
		h2.stateStart();
		h2.stateEnd();
		
	}
}
