package controller;

import java.util.*;
import model.Mundo;
import view.Interface;

public class Main 
{
	static Mundo mundo = new Mundo();
	static Interface gui = new Interface();
	static Scanner sc = new Scanner(System.in);
	static String com;
	public Main()
	{
		mundo = new Mundo();
		gui = new Interface();
	}
	public static void main(String[] args) 
	{
		boolean active = true;
		while(active == true)
		{
			System.out.print("$> ");
			com = sc.next();
			switch(com)
			{
				default:
					gui.badCOMmand(com);
					break;
				case("quit"):
					gui.goodbye();
					active = false;
					break;
				case("whoishere"):
					gui.whoishere();
					break;
				case("bird"):
					System.out.println("What should do bird?");
					System.out.print("bird $> ");
					String birdWN = sc.next();
					switch(birdWN)
					{
						default:
							gui.AnimalDoNot(com, birdWN);
							break;
						case("eat"):
							gui.AnimalDo(com, mundo.getBird().comer());
							break;
						case("sleep"):
							gui.AnimalDo(com, mundo.getBird().dormir());
							break;
						case("takeoff"):
							gui.AnimalDo(com, mundo.getBird().despegar());
							break;
						case("land"):
							gui.AnimalDo(com, mundo.getBird().aterrizar());
							break;
						case("fly"):
							gui.AnimalDo(com, mundo.getBird().volar());
							break;
					}
					break;
				case("seaplane"):
					System.out.println("What should do SeaPlane?");
					System.out.print("SeaPlane $> ");
					String spWN = sc.next();
					int sfuel=0;
					sfuel = mundo.getSeaplane().medirCombustible(sfuel);
					switch(spWN)
					{
						default:
							gui.VehicleDoNot(com, spWN);
							break;
						case("check"):
							gui.VehicleCheck(com, mundo.getSeaplane().medirCombustible(sfuel));
							break;
						case("refill"):
							gui.VehicleDo(com, mundo.getSeaplane().ponerCombustible(), sfuel);
							gui.VehicleCheck(com, mundo.getSeaplane().medirCombustible(sfuel));
							break;
						case("takeoff"):
							gui.VehicleDo(com, mundo.getSeaplane().despegar(), sfuel);
							gui.VehicleCheck(com, mundo.getSeaplane().medirCombustible(sfuel));
							break;
						case("land"):
							gui.VehicleDo(com, mundo.getSeaplane().aterrizar(), sfuel);
							gui.VehicleCheck(com, mundo.getSeaplane().medirCombustible(sfuel));
							break;
						case("fly"):
							gui.VehicleDo(com, mundo.getSeaplane().volar(), sfuel);
							gui.VehicleCheck(com, mundo.getSeaplane().medirCombustible(sfuel));
							break;
						case("start"):
							gui.VehicleDo(com, mundo.getSeaplane().prenderLata(), sfuel);
							gui.VehicleCheck(com, mundo.getSeaplane().medirCombustible(sfuel));
							break;
						case("stop"):
							gui.VehicleDo(com, mundo.getSeaplane().apagarLata(), sfuel);
							gui.VehicleCheck(com, mundo.getSeaplane().medirCombustible(sfuel));
							break;
						
					}
					break;
				case("helicopter"):
					System.out.println("What should do helicopter?");
					System.out.print("helicopter $> ");
					String helicopterWN = sc.next();
					int hfuel=0;
					hfuel = mundo.getHelicopter().medirCombustible(hfuel);
					switch(helicopterWN)
					{
						default:
							gui.VehicleDoNot(com, helicopterWN);
							break;
						case("check"):
							gui.VehicleCheck(com, mundo.getHelicopter().medirCombustible(hfuel));
							break;
						case("refill"):
							gui.VehicleDo(com, mundo.getHelicopter().ponerCombustible(), hfuel);
							gui.VehicleCheck(com, mundo.getHelicopter().medirCombustible(hfuel));
							break;
						case("takeoff"):
							gui.VehicleDo(com, mundo.getHelicopter().despegar(), hfuel);
							gui.VehicleCheck(com, mundo.getHelicopter().medirCombustible(hfuel));
							break;
						case("land"):
							gui.VehicleDo(com, mundo.getHelicopter().aterrizar(), hfuel);
							gui.VehicleCheck(com, mundo.getHelicopter().medirCombustible(hfuel));
							break;
						case("fly"):
							gui.VehicleDo(com, mundo.getHelicopter().volar(), hfuel);
							gui.VehicleCheck(com, mundo.getHelicopter().medirCombustible(hfuel));
							break;
						case("start"):
							gui.VehicleDo(com, mundo.getHelicopter().prenderLata(), hfuel);
							gui.VehicleCheck(com, mundo.getHelicopter().medirCombustible(hfuel));
							break;
						case("stop"):
							gui.VehicleDo(com, mundo.getHelicopter().apagarLata(), hfuel);
							gui.VehicleCheck(com, mundo.getHelicopter().medirCombustible(hfuel));
							break;
					}
					break;
				case("superman"):
					System.out.println("What should do Superman?");
					System.out.print("superman $> ");
					String supermanWN = sc.next();
					switch(supermanWN)
					{
						default:
							gui.AnimalDoNot(com, supermanWN);
							break;
						case("eat"):
							gui.AnimalDo(com, mundo.getSuperman().comer());
							break;
						case("sleep"):
							gui.AnimalDo(com, mundo.getSuperman().dormir());
							break;
						case("takeoff"):
							gui.AnimalDo(com, mundo.getSuperman().despegar());
							break;
						case("land"):
							gui.AnimalDo(com, mundo.getSuperman().aterrizar());
							break;
						case("fly"):
							gui.AnimalDo(com, mundo.getSuperman().volar());
							break;
						case("leap"):
							gui.AnimalDo(com, mundo.getSuperman().pegarEdificio());
							break;
						case("bullet"):
							gui.AnimalDo(com, mundo.getSuperman().frenarBala());
							break;
					}
					break;
			}
		}
	}
}
