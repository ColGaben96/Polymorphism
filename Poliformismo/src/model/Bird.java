package model;

public class Bird implements Flyer, Animal{

	@Override
	public String comer() {
		// TODO Auto-generated method stub
		return "looking for food...";
	}

	@Override
	public String dormir() {
		// TODO Auto-generated method stub
		return "looking for bed...";
	}

	@Override
	public String despegar() {
		// TODO Auto-generated method stub
		return "taking off...";
	}

	@Override
	public String aterrizar() {
		// TODO Auto-generated method stub
		return "landing...";
	}

	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return "flying...";
	}

}
