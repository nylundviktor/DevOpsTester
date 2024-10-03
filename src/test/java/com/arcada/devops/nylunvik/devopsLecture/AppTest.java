package com.arcada.devops.nylunvik.devopsLecture;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
	
	@Test // should be ! empty
	public void testFindFriendsEmpty()
	{
		System.out.println("We have run some tests!");
		assertFalse(App.findFriends(""));
	}
	
	@Test
	public void testFindFriendsErik()
	{
		assertTrue(App.findFriends("Erik"));
	}
	
	@Test
	public void testFindFriendsLisa()
	{
		assertTrue(App.findFriends("Lisa"));
	}
	
	@Test // should be ! missing
	public void testFindFriendsNone()
	{
		assertFalse(App.findFriends("asdasd"));
	}

}
