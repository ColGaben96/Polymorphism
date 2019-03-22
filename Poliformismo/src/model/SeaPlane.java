package model;

public class SeaPlane extends Airplane implements Flyer, Vehicle, Combustible
{
	int fueltank;
	@Override
	public String ponerCombustible() {
		// TODO Auto-generated method stub
		fueltank += 10000;
		return "filling fuel tank...";
	}

	@Override
	public int medirCombustible(int fuel) {
		// TODO Auto-generated method stub
		return fueltank;
	}

	@Override
	public String despegar() {
		// TODO Auto-generated method stub
		fueltank -= 4000;
		return "taking off...";
	}

	@Override
	public String aterrizar() {
		// TODO Auto-generated method stub
		fueltank -= 500;
		return "landing...";
	}

	@Override
	public String volar() {
		// TODO Auto-generated method stub
		fueltank -= 2500;
		return "flying...";
	}

	@Override
	public String prenderLata() {
		// TODO Auto-generated method stub
		fueltank -=200;
		return "starting engine...";
	}

	@Override
	public String apagarLata() {
		// TODO Auto-generated method stub
		return "stopping engine...";
	}
}
