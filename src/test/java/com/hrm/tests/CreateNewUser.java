package com.hrm.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.hrm.pojo.CreateNewUserData;
import apipage.specbuilder;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;


public class CreateNewUser {
	private specbuilder requestspec= new specbuilder();
	String creathuserpathparam="/authaccount/registration";
	String getuserpathparam="/users";
	
	@Test
	public void createNewUserViaApi() 
	{	

		CreateNewUserData requestuserdata= new CreateNewUserData();
		requestuserdata.setEmail("test1234567891010@mail.com");
		requestuserdata.setName("pointsbettest1");
		requestuserdata.setPassword("password123");
				
		
		CreateNewUserData responseuserdata=
		given(requestspec.getrequestspec()).body(requestuserdata)
		
		.when().post(creathuserpathparam)
		.then().spec(requestspec.getresponsespec()).statusCode(200)
		.extract()
		.response()
		.as(CreateNewUserData.class);

		Assert.assertEquals(responseuserdata.getData().getEmail(),requestuserdata.getEmail());

	}
	
	
	
	@Test
	public void getSpecificUserDetails() {
		Response response=given(requestspec.getrequestspec())
		.when().get("/users/"+301847)
		.then().spec(requestspec.getresponsespec()).statusCode(200).extract().response();
		
		String value=response.jsonPath().get("email");
		Assert.assertEquals(value, "devendra@mail.com");
	}

}
