package GUI;

import javax.swing.*;

import gameInterface.CharacterSelectControl;
import java.awt.GridLayout;
import java.awt.event.ActionListener;


public class CharacterSelectPanel extends JPanel {

	private JLabel errorLabel;
	

	public CharacterSelectPanel(CharacterSelectControl cs) {
		
		setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_2 = new JPanel();
		add(panel_2);
		
		JButton btnNewButton = new JButton("Choose Character 1");
		panel_2.add(btnNewButton);
		btnNewButton.addActionListener((ActionListener) cs);
		
		//Character 1 Label and Button------------------------------------------------
		JLabel character1Label = new JLabel("Character 1 Name(Water)");
		panel_2.add(character1Label);
		character1Label.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_3 = new JPanel();
		add(panel_3);
		
		JButton btnNewButton_1 = new JButton("Choose Character 2");
		panel_3.add(btnNewButton_1);	
		btnNewButton_1.addActionListener((ActionListener) cs);
		//----------------------------------------------------------------------------
				
		//Character 2 Label and Button------------------------------------------------
		JLabel character2Label = new JLabel("Character 2 Name(Fire)");
		panel_3.add(character2Label);
		character2Label.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel = new JPanel();
		add(panel);
		
		JLabel lblNewLabel_2 = new JLabel(new ImageIcon(this.getClass().getResource("/waterwiz.png")));
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		add(panel_1);
		
		JLabel lblNewLabel_3 = new JLabel(new ImageIcon(this.getClass().getResource("/fireWiz.png")));
		panel_1.add(lblNewLabel_3);
		
		JPanel panel_4 = new JPanel();
		add(panel_4);
		
		JButton btnNewButton_2 = new JButton("Choose Character 3");
		panel_4.add(btnNewButton_2);
		btnNewButton_2.addActionListener((ActionListener) cs);
		
		JLabel lblNewLabel = new JLabel("Character 3 Name (Earth)");
		panel_4.add(lblNewLabel);
		
		JPanel panel_5 = new JPanel();
		add(panel_5);
		
		JButton btnNewButton_3 = new JButton("Choose Character 4");
		panel_5.add(btnNewButton_3);
		btnNewButton_3.addActionListener((ActionListener) cs);
		
		JLabel lblNewLabel_1 = new JLabel("Character 4 Name (Air)");
		panel_5.add(lblNewLabel_1);
		
		JPanel panel_6 = new JPanel();
		add(panel_6);
		
		JLabel lblNewLabel_4 = new JLabel(new ImageIcon(this.getClass().getResource("/earthWiz.png")));
		panel_6.add(lblNewLabel_4);
		
		JPanel panel_7 = new JPanel();
		add(panel_7);
		
		JLabel lblNewLabel_5 = new JLabel(new ImageIcon(this.getClass().getResource("/whiteWiz.png")));
		panel_7.add(lblNewLabel_5);
	}
	
	//setter for error text
	public void setError(String error)
	{
		errorLabel.setText(error);
	}
}
