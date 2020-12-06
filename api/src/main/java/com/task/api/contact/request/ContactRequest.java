package com.task.api.contact.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ContactRequest {

    @NotBlank(message = "Contact should not be blank")
    private String contact;

    @Email(message = "In not email")
    private String email;

    private String phone;


}
