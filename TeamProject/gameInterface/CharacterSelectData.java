package gameInterface;

import java.io.Serializable;

public class CharacterSelectData implements Serializable{
	private String character;

	public String getCharacter() {
		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
	} 
	
	public CharacterSelectData(String character) {
		setCharacter(character);
	}

}
