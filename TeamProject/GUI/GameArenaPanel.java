package GUI;

import javax.swing.*;

public class GameArenaPanel extends JPanel {
	/**
	 * Create the panel.
	 */
	private JLabel errorLabel;
	

	public void TestPanel() {}

	public GameArenaPanel() {

		setLayout(null);
		
		//Player 1------------------------------------------------------
		JLabel player1Label = new JLabel("Player 1");
		player1Label.setBounds(10, 11, 49, 14);
		add(player1Label);
		
		//Player 1 Buttons----------------------------------------------
		JButton attackButton = new JButton("Attack");
		attackButton.setBounds(10, 232, 89, 23);
		add(attackButton);
		
		JButton defendButton = new JButton("Defend");
		defendButton.setBounds(10, 266, 89, 23);
		add(defendButton);
		
		JButton quitButton = new JButton("Quit Game");
		quitButton.setBounds(329, 266, 89, 23);
		add(quitButton);
		
		//Player 1 HP---------------------------------------------------
		JLabel hp1Label = new JLabel("HP: ");
		hp1Label.setHorizontalAlignment(SwingConstants.CENTER);
		hp1Label.setBounds(56, 11, 31, 14);
		add(hp1Label);
		
		JLabel hp1Indicator = new JLabel("0");
		hp1Indicator.setHorizontalAlignment(SwingConstants.CENTER);
		hp1Indicator.setBounds(77, 11, 22, 14);
		add(hp1Indicator);
		//---------------------------------------------------------------
		
		//Player 2-------------------------------------------------------
		JLabel player2Label = new JLabel("Player 2");
		player2Label.setBounds(313, 11, 49, 14);
		add(player2Label);
		
		//Player 2 HP----------------------------------------------------
		JLabel hp2Label = new JLabel("HP: ");
		hp2Label.setHorizontalAlignment(SwingConstants.CENTER);
		hp2Label.setBounds(372, 11, 31, 14);
		add(hp2Label);
		
		JLabel hp2Indicator = new JLabel("0");
		hp2Indicator.setHorizontalAlignment(SwingConstants.CENTER);
		hp2Indicator.setBounds(396, 11, 22, 14);
		add(hp2Indicator);
		//----------------------------------------------------------------
	}
	
	//setter for error text
	public void setError(String error)
	{
		errorLabel.setText(error);
	}
}
