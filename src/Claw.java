
public class Claw extends HammerBuilder {

	public Claw()
	{
		this.name = "Claw Hammer";
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
