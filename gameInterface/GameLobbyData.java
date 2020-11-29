package gameInterface;

public class GameLobbyData {
	  // Private data fields for the username and password.
	  private String character;
	  private String hp;
	  private String attack;
	  
	  // Getters for the username and password.
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
	  
	  // Setters for the username and password.
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
	  public GameLobbyData(String character, String hp, String attack)
	  {
	    setCharacter(character);
	    setHp(hp);
	    setAttack(attack);
	  }
}
