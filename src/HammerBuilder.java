import java.util.ArrayList;
import java.util.List;

public abstract class HammerBuilder {

	String name;
	List<String> state = new ArrayList<String>();

	public abstract HammerBuilder startcreation();
	public abstract HammerBuilder endcreation();


	
	public Hammer build() {
		Hammer h = new Hammer();
		h.setName(this.name);
		h.addItems(state);
		return h;
	}
	
}
