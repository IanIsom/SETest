package gameInterface;

import java.awt.*;
import javax.swing.*;
import GUI.LoginData;
import clientSubSystem.CreateAccountData;
import database.Database;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import ocsf.server.AbstractServer;
import ocsf.server.ConnectionToClient;

//update

public class GameServer extends AbstractServer
{
  // Data fields for this chat server.
  private JTextArea log;
  private JLabel status;
  private boolean running = false;
  private Database database; 
  private int numConnections; //UPDATE
  public int numlookingForGame;
  public ArrayList<ConnectionToClient> queue = new ArrayList<ConnectionToClient>();

  // Constructor for initializing the server with default settings.
  public GameServer()
  {
    super(12345);
    this.setTimeout(500);
  }

  // Getter that returns whether the server is currently running.
  public boolean isRunning()
  {
    return running;
  }
  
  // Setters for the data fields corresponding to the GUI elements.
  public void setLog(JTextArea log)
  {
    this.log = log;
  }
  public void setStatus(JLabel status)
  {
    this.status = status;
  }

  public void setDatabase(Database db) {
	  this.database = db;
  }
  // When the server starts, update the GUI.
  public void serverStarted()
  {
	  //server just started so no users yet...also clears in case of multiple resets
	setnumConnections(0);
    running = true;
    status.setText("Listening");
    status.setForeground(Color.GREEN);
    log.append("Server started\n");
  }
  
  public void setnumConnections (int nc) {
	  this.numConnections = nc;
  }
  
  public int getnumConnections() {
	  return numConnections;
  }
  
  // When the server stops listening, update the GUI.
   public void serverStopped()
   {
     status.setText("Stopped");
     status.setForeground(Color.RED);
     log.append("Server stopped accepting new clients - press Listen to start accepting new clients\n");
   }
 
  // When the server closes completely, update the GUI.
  public void serverClosed()
  {
    running = false;
    status.setText("Close");
    status.setForeground(Color.RED);
    log.append("Server and all current clients are closed - press Listen to restart\n");
  }

  // When a client connects or disconnects, display a message in the log.
  public void clientConnected(ConnectionToClient client)
  {
    log.append("Client " + client.getId() + " connected\n");
    //if user connected number connections increases..
  }

  // When a message is received from a client, handle it.
  public void handleMessageFromClient(Object arg0, ConnectionToClient arg1)
  {
	 try {
		database = new Database();
	} catch (SQLException | IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
    // If we received LoginData, verify the account information.
    if (arg0 instanceof LoginData)
    {
      // Check the username and password with the database.
      LoginData data = (LoginData)arg0;
      //setUsername(data.getUsername());
      Object result;
  	
      if (database.verifyAccount((String)data.getUsername(), data.getPassword()))
      {
    	numConnections++;
        result = "LoginSuccessful";
        log.append("Client " + arg1.getId() + " successfully logged in as " + data.getUsername() + "\n");
        //user successfully connected INCREMENT number of successful connections
        log.append("Number of Users Connected: " + numConnections + "\n");
      }
      else
      {
        result = new Error("The username and password are incorrect.", "Login");
        log.append("Client " + arg1.getId() + " failed to log in\n");
      }
      
      System.out.println("Result: " + result);
      
      // Send the result to the client.
      try
      {
        arg1.sendToClient(result);
      }
      catch (IOException e)
      {
        return;
      }
    }
    
    // If we received CreateAccountData, create a new account.
    else if (arg0 instanceof CreateAccountData)
    {
      // Try to create the account.
      CreateAccountData data = (CreateAccountData)arg0;
      Object result;
      if (database.createNewAccount(data.getUsername(), data.getPassword()))
      {
        result = "CreateAccountSuccessful";
        log.append("Client " + arg1.getId() + " created a new account called " + data.getUsername() + "\n");
      }
      else
      {
        result = new Error("The username is already in use.", "CreateAccount");
        log.append("Client " + arg1.getId() + " failed to create a new account\n");
      }
      
      // Send the result to the client.
      try
      {
        arg1.sendToClient(result);
      }
      catch (IOException e)
      {
        return;
      }
    }
    else if(arg0 instanceof CharacterData) {
    	
    	CharacterData data = (CharacterData)arg0;
    	log.append(arg1.getId() + " has selected the " + data.getCharacter() + " character\n");
    	//data.setUsername(getUsername());
    	
    	try {
			arg1.sendToClient("CharacterSelected");
		} catch (IOException e) {
			e.printStackTrace();
		}

    	
    }
    else if(arg0 instanceof GameLobbyData) {
    	log.append(arg1.getId() + " is currently searching for a game\n");
    	
    	numlookingForGame++;
    	queue.add(arg1);
    	
    	if (queue.size() >= 2) {
    		System.out.println("Found a Match!");
    		try {
        		numlookingForGame -= 2;
        		
            	log.append(queue.get(0).getId() + " and " + queue.get(1).getId() + " have connected and are in a game\n");
            	
    			queue.get(0).sendToClient("Player1 Found");
    			queue.get(1).sendToClient("Player2 Found");
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    	}
    	try {
			arg1.sendToClient("Finding");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	}  
    }
 

  // Method that handles listening exceptions by displaying exception information.
  public void listeningException(Throwable exception) 
  {
    running = false;
    status.setText("Exception occurred while listening");
    status.setForeground(Color.RED);
    log.append("Listening exception: " + exception.getMessage() + "\n");
    log.append("Press Listen to restart server\n");
  }
}

