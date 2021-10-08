
public class Club extends   HammerBuilder {

	public Club()
	{
		this.name = "Club Hammer";
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
