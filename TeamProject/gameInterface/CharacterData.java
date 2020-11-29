package gameInterface;

import java.io.Serializable;

public class CharacterData implements Serializable{
	  // Private data fields for the username and password.
	  private String username;
	  private String character;
	  private String hp;
	  private String attack;
	  

	  public String getUsername() {
		  return username;
	  }
	  public String getCharacter()
	  {
	    return character;
	  }
	  public String getHp()
	  {
	    return hp;
	  }
	  
	  public String getAttack() {
		  return attack;
	  }
	  
	  public void setUsername(String username) {
		  this.username = username;
	  }
	  public void setCharacter(String character)
	  {
	    this.character = character;
	  }
	  public void setHp(String hp)
	  {
	    this.hp = hp;
	  }
	  
	  public void setAttack(String attack) {
		  this.attack = attack;
	  }
	  
	  // Constructor that initializes the username and password.
	  public CharacterData(String username, String character, String hp, String attack)
	  {
		setUsername(username);
	    setCharacter(character);
	    setHp(hp);
	    setAttack(attack);
	  }

}
