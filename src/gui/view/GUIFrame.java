package gui.view;

import javax.swing.JFrame;
import gui.controller.GUIController;

public class GUIFrame extends JFrame
{
	private GUIController basicController;
	private GUIPanel basePanel;
	
	public GUIFrame(GUIController baseController)
	{
		this.basicController = baseController;
		basePanel = new GUIPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel); //Must be first line of setupFrame.
		this.setSize(400,400);          //Find a good size for the app.
		this.setTitle("This app sucks...");
		this.setResizable(false);       //Advisable, but not required.
		this.setVisible(True);          //Must be last line of setupFrame.
	}
	
	public GUIController getBaseController()
	{
		return basicController;
	}
}
