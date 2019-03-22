package model;

public abstract class Airplane implements Flyer, Combustible, Vehicle
{

	@Override
	public String ponerCombustible() {
		// TODO Auto-generated method stub
		return "Llenando...";
	}

	@Override
	public int medirCombustible(int cantidad) {
		// TODO Auto-generated method stub
		return cantidad;
	}

	@Override
	public String despegar() {
		// TODO Auto-generated method stub
		return "Despegando...";
	}

	@Override
	public String aterrizar() {
		// TODO Auto-generated method stub
		return "Aterrizando...";
	}

	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return "Volando...";
	}

	@Override
	public String prenderLata() {
		// TODO Auto-generated method stub
		return "Encendiendo...";
	}

	@Override
	public String apagarLata() {
		// TODO Auto-generated method stub
		return "Apagando...";
	}
	
}
