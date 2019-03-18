package controller;
import java.util.Scanner;

import model.MyModel;
import view.Interface;

public class Controller 
{
	private static Scanner sc = new Scanner(System.in);
	private Interface gui;
	private MyModel model;
	public Controller()
	{
		gui = new Interface();
		model = new MyModel();
		
	}
	
	public void SeaPlane()
	{
		gui.SeaPlaneReady();
	}
}
