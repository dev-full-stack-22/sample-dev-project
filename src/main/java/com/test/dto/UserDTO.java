package com.test.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

	@JsonProperty("id")
	private Integer id;

	@NotNull
	@JsonProperty("firstName")
	private String firstName;

	@NotNull
	@JsonProperty("lastName")
	private String lastName;

	@NotNull
	@Email
	@JsonProperty("email")
	private String email;

}
