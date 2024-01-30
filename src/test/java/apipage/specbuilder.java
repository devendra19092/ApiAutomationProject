package apipage;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class specbuilder {
	String BaseURL="http://restapi.adequateshop.com/";
	String BasePath="api";
	
	
	public RequestSpecification getrequestspec() {
		
		RequestSpecBuilder reqspecbuilder= new RequestSpecBuilder();
		RequestSpecification requestspec=reqspecbuilder.setBaseUri(BaseURL)
				      .setBasePath(BasePath)
		              .addHeader("Authorization","Bearer "+"79a141df-68ab-4e07-9926-1d347335cc7b")
		              .setContentType(ContentType.JSON)
		              .log(LogDetail.ALL)
		              .build();
		 return requestspec;
	}
	public ResponseSpecification getresponsespec() {
		
		ResponseSpecBuilder resspecbuilder= new ResponseSpecBuilder();
		ResponseSpecification  responsespec=resspecbuilder.expectContentType(ContentType.JSON)
		              .log(LogDetail.ALL)
		              .build();
		return responsespec;
		
	}

}
