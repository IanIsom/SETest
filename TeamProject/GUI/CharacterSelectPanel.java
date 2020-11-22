package GUI;

import javax.swing.*;
import javax.swing.SwingConstants;

public class CharacterSelectPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	private JLabel errorLabel;
	
	public CharacterSelectPanel() {
		setLayout(null);
		
		//Character 1 Label and Button------------------------------------------------
		JLabel character1Label = new JLabel("Character 1 Name(Water)");
		character1Label.setHorizontalAlignment(SwingConstants.CENTER);
		character1Label.setBounds(5, 50, 138, 52);
		add(character1Label);
		
		JButton btnNewButton = new JButton("Choose Character 1");
		btnNewButton.setBounds(5, 116, 138, 35);
		add(btnNewButton);
		//----------------------------------------------------------------------------
		
		//Character 2 Label and Button------------------------------------------------
		JLabel character2Label = new JLabel("Character 2 Name(Fire)");
		character2Label.setHorizontalAlignment(SwingConstants.CENTER);
		character2Label.setBounds(165, 50, 122, 52);
		add(character2Label);
		
		JButton btnNewButton_1 = new JButton("Choose Character 2");
		btnNewButton_1.setBounds(149, 116, 138, 35);
		add(btnNewButton_1);
		//----------------------------------------------------------------------------
		
		//Character 3 Label and Button------------------------------------------------
		JLabel character3Label = new JLabel("Character 3 Name(Earth)");
		character3Label.setHorizontalAlignment(SwingConstants.CENTER);
		character3Label.setBounds(5, 205, 138, 44);
		add(character3Label);
		
		JButton btnNewButton_2 = new JButton("Choose Character 3");
		btnNewButton_2.setBounds(5, 263, 138, 35);
		add(btnNewButton_2);
		//----------------------------------------------------------------------------
		
		//Character 4 Label and Button------------------------------------------------
		JLabel character4Label = new JLabel("Character 4 Name(Air)");
		character4Label.setHorizontalAlignment(SwingConstants.CENTER);
		character4Label.setBounds(165, 201, 115, 52);
		add(character4Label);
		
		JButton btnNewButton_3 = new JButton("Choose Character 4");
		btnNewButton_3.setBounds(149, 263, 138, 35);
		add(btnNewButton_3);
		//---------------------------------------------------------------------------
	}
	
	//setter for error text
	public void setError(String error)
	{
		errorLabel.setText(error);
	}
}
