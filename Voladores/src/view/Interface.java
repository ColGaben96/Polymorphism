package view;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Interface extends JPanel
{
	private static final long serialVersionUID = 1L;
	public Interface()
	{
		
	}
	public String WhatNow()
	{
		return JOptionPane.showInputDialog(null, "Insert a Command");
	}
	public void NotACommand()
	{
		JOptionPane.showMessageDialog(null, "Not a command", "ERROR", JOptionPane.ERROR_MESSAGE);
	}
	public void SeaPlaneReady()
	{
		JOptionPane.showMessageDialog(null, "SeaPlane is ready to go", "Information", JOptionPane.INFORMATION_MESSAGE);
	}
	public void SeaPlaneTakeOff()
	{
		JOptionPane.showMessageDialog(null, "SeaPlane is going to take off", "Warning", JOptionPane.WARNING_MESSAGE);
	}
	public void SeaPlaneisFlying()
	{
		JOptionPane.showMessageDialog(null, "SeaPlane is busy at this moment", "Error", JOptionPane.ERROR_MESSAGE);
	}
}
