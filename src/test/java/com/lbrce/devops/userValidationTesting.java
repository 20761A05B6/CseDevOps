package com.lbrce.devops;

import org.testng.Assert;
import org.testng.annotations.Test;

public class userValidationTesting {
	@Test
	public void testCase1() {
		userValidation uv=new userValidation();
		Assert.assertEquals(false,uv.check("gns", "gns@B6"));
	}
	@Test
	public void testCase2() {
		userValidation uv=new userValidation();
		Assert.assertEquals(true,uv.check("lbrce", "lbrce@76"));
	}
	@Test
	public void testCase3() {
		userValidation uv=new userValidation();
		Assert.assertEquals(false,uv.check("gns", "gns@B6"));
	}
	@Test
	public void testCase4() {
		userValidation uv=new userValidation();
		Assert.assertEquals(false,uv.check("gns", "gns@B6"));
	}
}
