package GUI;

public class InitialControl implements ActionListener{
	
	//private data field for storing container
	private JPanel container;
	
	//constructor for the initial controller
	public InitialControl(JPanel container)
	{
		this.container = container;
	}
	
	//handle button clicks
	public void actionPerformed(ActionEventae)
	{
		//get name of buttonclicked
		String command = ae.getActionCommand();
		
		//the login button takes the user to the login panel
		if(command.equals("Login"))
		{
			
		}
		
		//the create button takes the user to the create account panel
		else if(command.equals("Create"))
		{
			CreateAccount createAccountPanel = (CreateAccountPanel)container.getComponent(2);
			
		}
	}
}
