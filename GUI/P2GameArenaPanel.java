package GUI;

import javax.swing.*;

import gameInterface.P1GameArenaControl;
import java.awt.GridLayout;

public class P2GameArenaPanel extends JPanel {
	
	private JLabel hp2Indicator;
	private JLabel hp1Indicator;
	private JLabel characterTwo;
	private JLabel characterOne;

	public P2GameArenaPanel(P1GameArenaControl ga) {
		setLayout(new GridLayout(0, 5, 0, 0));
		
		JPanel panel = new JPanel();
		add(panel);
		//---------------------------------------------------------------
		
		//Player 2-------------------------------------------------------
		JLabel player2Label = new JLabel("Player 2");
		panel.add(player2Label);
		
		//Player 1 HP---------------------------------------------------
		JLabel hp1Label = new JLabel("HP: ");
		panel.add(hp1Label);
		hp1Label.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel hp2Indicator_1 = new JLabel("0");
		panel.add(hp2Indicator_1);
		hp2Indicator_1.setHorizontalAlignment(SwingConstants.CENTER);
						
						JPanel panel_14 = new JPanel();
						add(panel_14);
				
				JPanel panel_15 = new JPanel();
				add(panel_15);
				
				JPanel panel_2 = new JPanel();
				add(panel_2);
				
				JPanel panel_7 = new JPanel();
				add(panel_7);
				
				//Player 1------------------------------------------------------
				JLabel player1Label = new JLabel("Player 1");
				panel_7.add(player1Label);
				
				//Player 2 HP----------------------------------------------------
				JLabel hp2Label = new JLabel("HP: ");
				panel_7.add(hp2Label);
				hp2Label.setHorizontalAlignment(SwingConstants.CENTER);
				
				JLabel hp1Indicator_1 = new JLabel("0");
				panel_7.add(hp1Indicator_1);
				hp1Indicator_1.setHorizontalAlignment(SwingConstants.CENTER);
				
				JPanel panel_8 = new JPanel();
				add(panel_8);
				
				JLabel characterTwo_1 = new JLabel("Character 2 Goes Here");
				panel_8.add(characterTwo_1);
				
				JPanel panel_1 = new JPanel();
				add(panel_1);
				
				JPanel panel_13 = new JPanel();
				add(panel_13);
				
				JPanel panel_16 = new JPanel();
				add(panel_16);
				
				JPanel panel_3 = new JPanel();
				add(panel_3);
				
				JLabel characterOne_1 = new JLabel("Character1 Goes Here");
				panel_3.add(characterOne_1);
				
				JPanel panel_6 = new JPanel();
				add(panel_6);
				
				//Player 1 Buttons----------------------------------------------
				JButton attackButton = new JButton("Attack");
				panel_6.add(attackButton);
				
				JButton defendButton = new JButton("Defend");
				panel_6.add(defendButton);
				
				JPanel panel_9 = new JPanel();
				add(panel_9);
				
				JPanel panel_10 = new JPanel();
				add(panel_10);
				
				JPanel panel_11 = new JPanel();
				add(panel_11);
				
				JPanel panel_12 = new JPanel();
				add(panel_12);
				
				JButton quitButton = new JButton("Quit Game");
				panel_12.add(quitButton);
	}
	
	public void setHp1(String hp) {
		hp1Indicator.setText(hp);
	}
	
	public void setHp2(String hp) {
		hp2Indicator.setText(hp);
	}
	
	public void setChar1(String character1) {
		characterOne.setText(character1);
	}
	
	public void setChar2(String character2) {
		characterTwo.setText(character2);
	}
	
	
}
