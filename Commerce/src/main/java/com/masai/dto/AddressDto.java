package com.masai.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AddressDto {

      
	@Size(min = 3, max = 10, message = "Street no should be min 3 or max 10")
	private String streetNo;
	
     private String  bulidingName;
	
	@NotNull
	@NotBlank
	@NotEmpty
	private String city;
	
	@NotNull
	@NotBlank
	@NotEmpty
	private String state;
	
	
	@NotNull
	@NotBlank
	@NotEmpty
	private String country;
	
	
	@Size(min = 3, max =6 , message = "Pincode should be min 3 and maximum 6")
	private String pincode;


	public AddressDto(@Size(min = 3, max = 10, message = "Street no should be min 3 or max 10") String streetNo,
			String bulidingName, @NotNull @NotBlank @NotEmpty String city, @NotNull @NotBlank @NotEmpty String state,
			@NotNull @NotBlank @NotEmpty String country,
			@Size(min = 3, max = 6, message = "Pincode should be min 3 and maximum 6") String pincode) {
		super();
		this.streetNo = streetNo;
		this.bulidingName = bulidingName;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}

	
	
}

