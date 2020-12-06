package com.task.api.project.request;

import com.task.api.contact.request.ContactRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProjectRequest {


    @NotBlank(message = "Title should not be blank")
    @Size(max = 350, message = "Title has not to be  more than 350 ")
    private String title;

    @Min(value = 0, message = "status has to be more than or equal to 0")
    private int status;

    private List<ContactRequest> contacts;
}
