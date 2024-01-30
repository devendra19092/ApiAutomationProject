package com.hrm.tests;
import static io.restassured.RestAssured.*;

import com.hrm.pojo.CreateNewUserData;

import apipage.specbuilder;

public class UserLogin {
	
	specbuilder apispec=new specbuilder();
	public String loginpathparameter="/authaccount/login";
	
	public void UserloginSuccesfully() {
		
		CreateNewUserData requestbody=new CreateNewUserData();
		requestbody.setEmail("");
		given(apispec.getrequestspec()).body(apispec)
		.when()
		.post(loginpathparameter)
		.then().extract().response();
		
	}
	
	

}
