package com.task.service.project.entity;


import com.task.service.base.BaseEntity;
import com.task.service.contact.entity.ContactEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Table;
import java.util.List;

@Getter
@Setter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "project")
public class ProjectEntity extends BaseEntity {

    private String title;

    private int status;

    @ElementCollection(fetch = FetchType.EAGER)
    private List<ContactEntity> contacts;
}
