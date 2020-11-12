package database;

import java.io.*;
import java.sql.*;
import java.util.*;


public class Database
{
	private Connection conn;
  
	public Database() throws SQLException, IOException
	{
	    Properties prop = new Properties();
	    FileInputStream fis = new FileInputStream("lab7out/db.properties");
	    prop.load(fis);
	    try {		    
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Yikes");
		}
	    

	    String url = prop.getProperty("url");
	    String user = prop.getProperty("user");
	    String pass = prop.getProperty("password"); 
	    
	    System.out.println(url + " " + user + " " + pass);
	    conn = DriverManager.getConnection(url,user,pass);

	}
  
	public ArrayList<String> query(String query) throws SQLException
	  {	  
		  Statement stmt = conn.createStatement();
		  
		  ResultSet rs=stmt.executeQuery(query); 
		  
		  ArrayList<String> list = new ArrayList<String>();
		  
		  String insert = "";
		  
	      while(rs.next()) 
	      {
	        insert = (rs.getString(1)+", "+rs.getString(2));
	        list.add(insert);
	      }
	      return list;
	      
	  }
	
	public void insert(String query) throws SQLException
	  {	  
		  Statement stmt = conn.createStatement();
		  
		  stmt.executeUpdate(query); 
	      
	  }
	  
	  public void executeDML(String dml) throws SQLException
	  {
		  Statement stmt = conn.createStatement();
	      stmt.execute(dml);
	
	  }
	  
	  // Method for verifying a username and password.
	  public boolean verifyAccount(String username, String password)
	  {		  
		try {
			ArrayList<String> verify = query("select username, aes_decrypt(password, 'key') from user");
			String[] newVerify;
			
			//ArrayList<String> a = query("select * from user");
			for(int i = 0; i < verify.size(); i++) {
				newVerify = verify.get(i).split(",");
				
				if(newVerify[0].equals(username) && newVerify[1].trim().equals(password)) {
					return true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;  
   
	  }
	  // Method for creating a new account.
	  public boolean createNewAccount(String username, String password)
	  {
		  try {
			  insert("INSERT INTO user" 
					  + "(username, password)"
					  + "VALUES ('"+ username +"', aes_encrypt('" + password + "','key'))");
					 return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}  
	
	  }
	  
	  //add a friend in the lobby
	  public boolean addContact(String usernameAdder, String usernameAdded)
	  {
		  try {
			  insert("INSERT INTO contact" 
					  + "(username, contact_username)"
					  + "VALUES ('"+ usernameAdder +"', aes_encrypt('" + usernameAdded + "','key'))");
					 return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}  
	
	  }
	}
