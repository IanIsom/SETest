package database;

import static org.junit.Assert.*;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import database.Database;


public class DatabaseTest {

	private String[] users = {"j_smith123","m_smith33","t_jones11","j_jones46"};
	private String[] passwords = {"hello123","pass123","123456","hello1234"};
	private Database db; 
	private Connection conn;
	private int rando; 

	
	
	@Before
	public void setUp() throws Exception
	{
		db = new Database();
		rando = ((int)Math.random()*users.length);
	}
	
	@Test
	public void testSetConnection(Connection conn) 
	{
		this.conn = conn; 
		
	}
	
	@Test
	public void testQuery() throws IOException, SQLException 
	{
		
		//Use Random # to extract username/ and expected password
		
		String username = users[rando];
		String expected = passwords[rando];
		
		//get actual result (invoke query with username)
		ArrayList<String> actual = db.query(username);
				
		assertEquals(expected, actual);
		
	}
}
