package GUI;

import javax.swing.*;
import java.awt.*;
import javax.swing.SwingConstants;
import clientSubSystem.CreateAccountControl;
import gameInterface.CharacterSelectControl;


public class CharacterSelectPanel extends JPanel {

	private JLabel errorLabel;	

	public CharacterSelectPanel(CharacterSelectControl cs) {

		setLayout(null);
		
		//Character 1 Label and Button------------------------------------------------
		JLabel character1Label = new JLabel("Character 1 Name(Water)");
		character1Label.setHorizontalAlignment(SwingConstants.CENTER);
		character1Label.setBounds(54, 0, 168, 52);
		this.add(character1Label);
		
		JButton btnNewButton = new JButton("Choose Character 1");
		btnNewButton.setBounds(54, 180, 168, 35);
		this.add(btnNewButton);

		//----------------------------------------------------------------------------
		
		//Character 2 Label and Button------------------------------------------------
		JLabel character2Label = new JLabel("Character 2 Name(Fire)");
		character2Label.setHorizontalAlignment(SwingConstants.CENTER);
		character2Label.setBounds(250, 0, 168, 52);
		this.add(character2Label);
		
		JButton btnNewButton_1 = new JButton("Choose Character 2");
		btnNewButton_1.setBounds(250, 180, 168, 35);
		this.add(btnNewButton_1);
		/*
		//----------------------------------------------------------------------------
		
		//Character 3 Label and Button------------------------------------------------
		JLabel character3Label = new JLabel("Character 3 Name(Earth)");
		character3Label.setHorizontalAlignment(SwingConstants.CENTER);
		character3Label.setBounds(54, 312, 168, 44);
		this.add(character3Label);
		
		JButton btnNewButton_2 = new JButton("Choose Character 3");
		btnNewButton_2.setBounds(54, 529, 168, 35);
		this.add(btnNewButton_2);
		//----------------------------------------------------------------------------
		
		//Character 4 Label and Button------------------------------------------------
		JLabel character4Label = new JLabel("Character 4 Name(Air)");
		character4Label.setHorizontalAlignment(SwingConstants.CENTER);
		character4Label.setBounds(443, 308, 150, 52);
		this.add(character4Label);
		
		JButton btnNewButton_3 = new JButton("Choose Character 4");
		btnNewButton_3.setBounds(443, 529, 168, 35);
		this.add(btnNewButton_3);
		//---------------------------------------------------------------------------
		*/
	}
	
	//setter for error text
	public void setError(String error)
	{
		errorLabel.setText(error);
	}
}
