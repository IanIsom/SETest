package GUI;

import javax.swing.JPanel;

public class GameLobbyPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	private JLabel errorLabel;
	
	public TestPanel() {
		setLayout(null);
		
		JList list = new JList();
		list.setBounds(34, 61, 156, 149);
		add(list);
		
		JLabel gameListLabel = new JLabel("Game List");
		gameListLabel.setBounds(34, 36, 49, 14);
		add(gameListLabel);
		
		JButton readyButton = new JButton("Ready To Play");
		readyButton.setBounds(58, 221, 109, 23);
		add(readyButton);
		
		JButton findGameButton = new JButton("Find Games");
		findGameButton.setBounds(93, 25, 97, 25);
		add(findGameButton);

	}
	
	//setter for error text
	public void setError(String error)
	{
		errorLabel.setText(error);
	}
}
