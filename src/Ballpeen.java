
public class Ballpeen extends HammerBuilder {

	public Ballpeen()
	{
		this.name = "Ballpeen Hammer";
	}
	@Override
	public HammerBuilder startcreation() {
		this.state.add(name + " is creating...");
		return this;
	}

	@Override
	public HammerBuilder endcreation() {
		this.state.add(name + " is not creating now...");
		return this;
	}

}
