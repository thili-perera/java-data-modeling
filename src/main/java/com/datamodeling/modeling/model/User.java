package com.datamodeling.modeling.model;

import jakarta.validation.constraints.*;

import java.time.LocalDate;
import java.util.Date;

public class User {
    private Long id;

    @NotBlank(message = "First name is a required field")
    @Size(min = 2,max = 50, message = "First name must be between 2 and 50 characters")
    private String first_name;

    @NotBlank(message = "Last name is a required field")
    @Size(min = 2,max = 50, message = "Last name must be between 2 and 50 characters")
    private String last_name;

    @NotBlank(message = "Email cannot be empty")
    @Email(message = "Email must be valid")
    private String email;

    @NotBlank(message = "Email cannot be empty")
    @Pattern(regexp = "^[0-9]{10}$",message = "Phone number must contain 10 digits")
    private String phone_number;

    @NotNull(message = "Date of birth is must")
    @Past(message = "Date of birth must  be past one")
    private LocalDate dob;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }


}
