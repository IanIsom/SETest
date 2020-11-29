package gameInterface;

import java.io.Serializable;

public class CharacterData implements Serializable{
	private String character;

	public String getCharacter() {
		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
	} 
	
	public CharacterData(String character) {
		setCharacter(character);
	}

}
