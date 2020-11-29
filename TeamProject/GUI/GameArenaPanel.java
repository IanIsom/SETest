package GUI;

import javax.swing.*;

import gameInterface.GameArenaControl;
import java.awt.GridLayout;

public class GameArenaPanel extends JPanel {
	
	private JLabel errorLabel;

	public GameArenaPanel(GameArenaControl ga) {
		setLayout(new GridLayout(0, 5, 0, 0));
		
		JPanel panel = new JPanel();
		add(panel);
		
		//Player 1------------------------------------------------------
		JLabel player1Label = new JLabel("Player 1");
		panel.add(player1Label);
				
				//Player 2 HP----------------------------------------------------
				JLabel hp2Label = new JLabel("HP: ");
				panel.add(hp2Label);
				hp2Label.setHorizontalAlignment(SwingConstants.CENTER);
				
				JLabel hp1Indicator = new JLabel("0");
				panel.add(hp1Indicator);
				hp1Indicator.setHorizontalAlignment(SwingConstants.CENTER);
						
						JPanel panel_7 = new JPanel();
						add(panel_7);
				
						//----------------------------------------------------------------
						JLabel moveInfo = new JLabel("");
						add(moveInfo);
				
				JLabel label = new JLabel("");
				add(label);
				
				JPanel panel_2 = new JPanel();
				add(panel_2);
				//---------------------------------------------------------------
				
				//Player 2-------------------------------------------------------
				JLabel player2Label = new JLabel("Player 2");
				panel_2.add(player2Label);
				
				//Player 1 HP---------------------------------------------------
				JLabel hp1Label = new JLabel("HP: ");
				panel_2.add(hp1Label);
				hp1Label.setHorizontalAlignment(SwingConstants.CENTER);
				
				JLabel hp2Indicator = new JLabel("0");
				panel_2.add(hp2Indicator);
				hp2Indicator.setHorizontalAlignment(SwingConstants.CENTER);
				
				JLabel label_1 = new JLabel("");
				add(label_1);
				
				JPanel panel_8 = new JPanel();
				add(panel_8);
				
				JLabel label_2 = new JLabel("");
				add(label_2);
				
				JPanel panel_1 = new JPanel();
				add(panel_1);
				
				JLabel label_3 = new JLabel("");
				add(label_3);
				
				JPanel panel_3 = new JPanel();
				add(panel_3);
				
				//Player 1 Buttons----------------------------------------------
				JButton attackButton = new JButton("Attack");
				panel_3.add(attackButton);
				
				JButton defendButton = new JButton("Defend");
				panel_3.add(defendButton);
				
				JLabel label_4 = new JLabel("");
				add(label_4);
				
				JLabel label_5 = new JLabel("");
				add(label_5);
				
				JLabel label_6 = new JLabel("");
				add(label_6);
				
				JPanel panel_4 = new JPanel();
				add(panel_4);
				
				JButton quitButton = new JButton("Quit Game");
				panel_4.add(quitButton);
				
				JPanel panel_5 = new JPanel();
				add(panel_5);
				
				JPanel panel_6 = new JPanel();
				add(panel_6);
	}
	
	//setter for error text
	public void setError(String error)
	{
		errorLabel.setText(error);
	}
}
