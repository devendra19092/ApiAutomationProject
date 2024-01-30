package com.hrm.tests;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;
import apipage.specbuilder;

public class GetallUsersDetails {
	private specbuilder requestspec= new specbuilder();
	String getuserpathparam="/users";

	@Test
	public void getAllUserDetails() {
		
		given(requestspec.getrequestspec())
		.when().get(getuserpathparam)
		.then().spec(requestspec.getresponsespec()).statusCode(200);
	
	}
}
