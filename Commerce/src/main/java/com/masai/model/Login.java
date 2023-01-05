package com.masai.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Login {

	@NotNull
	@NotBlank
	@NotEmpty
	private String email;
	
	
	@NotNull
	@NotBlank
	@NotEmpty
	private String password;
	
	
	@NotNull
	@NotBlank
	@NotEmpty
	private String roll;

	
	
}


