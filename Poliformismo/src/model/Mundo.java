package model;

public class Mundo 
{
	private Superman superman;
	private Bird bird;
	private SeaPlane seaplane;
	private Helicopter helicopter;
	
	public Mundo()
	{
		superman = new Superman();
		bird = new Bird();
		seaplane = new SeaPlane();
		helicopter = new Helicopter();	
	}

	public Superman getSuperman() {
		return superman;
	}

	public void setSuperman(Superman superman) {
		this.superman = superman;
	}

	public Bird getBird() {
		return bird;
	}

	public void setBird(Bird bird) {
		this.bird = bird;
	}

	public SeaPlane getSeaplane() {
		return seaplane;
	}

	public void setSeaplane(SeaPlane seaplane) {
		this.seaplane = seaplane;
	}

	public Helicopter getHelicopter() {
		return helicopter;
	}

	public void setHelicopter(Helicopter helicopter) {
		this.helicopter = helicopter;
	}
}
