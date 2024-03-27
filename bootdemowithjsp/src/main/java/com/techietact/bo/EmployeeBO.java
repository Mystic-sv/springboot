package com.techietact.bo;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class EmployeeBO {
private long id;
@NotNull
private String employeeName;
@Email(message="enter valid email")
private String email;
}
