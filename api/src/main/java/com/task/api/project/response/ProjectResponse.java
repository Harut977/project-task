package com.task.api.project.response;

import com.task.api.contact.response.ContactResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProjectResponse {

    private Long id;

    private String title;

    private int status;

    private List<ContactResponse> contacts;

    private Date createdDate;

    private Date lastModifiedDate;

}
