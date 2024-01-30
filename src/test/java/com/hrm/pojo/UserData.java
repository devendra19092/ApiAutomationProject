package com.hrm.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true) 
public class UserData {
	@JsonProperty("Id")
	private int id;
	
	@JsonProperty("Name")
	private String Name;
	
	@JsonProperty("Email")
	private String Email;
	
	@JsonProperty("Token")
	private String Token;

}
