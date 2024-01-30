package com.hrm.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;
   @JsonInclude(value=Include.NON_DEFAULT)

   @JsonIgnoreProperties(ignoreUnknown = true)   
   //Ignore all fileds from response which we don't wamt to validate.
   
   @Data
   /*
    * @Data is a shortcut annotation that combines the features of
    * @ToString, @EqualsAndHashCode, @Getter @Setter, and @RequiredArgsConstructor
    * together. So, @Data generates all the boilerplate involved in POJOs (Plain
    * Old Java Objects). This means, in particular, getters for all fields, setters
    * for all non-final fields, proper toString, equals, and hashCode
    * implementations involving every field of the class, and a constructor for all
    * final fields.
    */

public class CreateNewUserData {
	
	
	private String Name;
	private String Email;
	private String password;
	private int code;
	private String message;
	private UserData data;
}
