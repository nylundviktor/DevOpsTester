package com.arcada.devops.nylunvik.devopsLecture;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;

public class AppTest
{

	App app;
	
	@Before
	public void setUp() throws Exception
	{
		app = new App();
	}
	
	@After
	public void tearDown() throws Exception
	{

	}
	
	@Test
	public void testCreateServer()
	{
		System.out.println("V har testat om de funkar!");
		assertTrue(app.createServer());
	}

}
