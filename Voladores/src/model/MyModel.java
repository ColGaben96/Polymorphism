package model;

public class MyModel 
{
	private boolean busy, ready;
	private SeaPlane sp;
	public MyModel()
	{
		sp = new SeaPlane();
	}
	public SeaPlane getSp() 
	{
		return sp;
	}
	public boolean SeaPlaneisTaken()
	{
		busy = true;
		ready = false;
		return busy;
	}
	public boolean SeaPlaneisFree()
	{
		busy = false;
		ready = true;
		return ready;
	}
	
}
