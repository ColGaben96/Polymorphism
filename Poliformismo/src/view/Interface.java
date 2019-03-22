package view;

import javax.swing.*;

public class Interface extends JPanel
{
	private static final long serialVersionUID = 1L;
	public Interface()
	{
		
	}
	public void badCOMmand(String command)
	{
		JOptionPane.showMessageDialog(null, "Sorry. "+command+" is not here. but you can ask 'whoishere'.", "Nope", JOptionPane.ERROR_MESSAGE, null);
	}
	public void goodbye()
	{
		JOptionPane.showMessageDialog(null, "Goodbye!", null, JOptionPane.INFORMATION_MESSAGE, null);
	}
	public void whoishere()
	{
		JOptionPane.showMessageDialog(null, "bird, seaplane, helicopter and superman", "Here is", JOptionPane.INFORMATION_MESSAGE, null);
	}
	public void AnimalDo(String command, String willdo)
	{
		JOptionPane.showMessageDialog(null,command+" is "+willdo,null, JOptionPane.INFORMATION_MESSAGE, null);
	}
	public void AnimalDoNot(String command, String willdo)
	{
		JOptionPane.showMessageDialog(null,command+" won't "+willdo,null, JOptionPane.WARNING_MESSAGE, null);
	}
	public void VehicleDo(String command, String willdo, int remaining)
	{
		JOptionPane.showMessageDialog(null,command+" is "+willdo+". \nlast fuel remaining: "+remaining,null, JOptionPane.INFORMATION_MESSAGE, null);
	}
	public void VehicleDoNot(String command, String willdo)
	{
		JOptionPane.showMessageDialog(null,command+" won't "+willdo,null, JOptionPane.WARNING_MESSAGE, null);
	}
	public void VehicleCheck(String command, int check)
	{
		JOptionPane.showMessageDialog(null,command+" actual fuel remaining: "+check, null, JOptionPane.INFORMATION_MESSAGE, null);
	}
}
