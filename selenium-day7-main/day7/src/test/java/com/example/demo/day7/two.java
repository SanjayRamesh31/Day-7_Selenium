package com.example.demo.day7;


import org.testng.Assert;
import org.testng.annotations.Test;

public class two {
	  int x=2;
		int y=6;
		int z=9;
	  @Test
	  public void add() {
		  Assert.assertEquals(x+y,8);
	  }
	  @Test
	  public void sub() {
		  Assert.assertEquals(x-y,-4);
	  }
	  @Test
	  public void multiply() {
		  Assert.assertEquals(x*y,12);
	  }
	  @Test
	  public void divide() {
		  Assert.assertEquals(y/x,3);
	  }
}
