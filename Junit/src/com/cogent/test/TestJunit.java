package com.cogent.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunit {
	   @Test
	   public void testSetup() {
	      String str= "Junit setup is done";
	      assertEquals("Junit setup is done",str);
	   }
	}