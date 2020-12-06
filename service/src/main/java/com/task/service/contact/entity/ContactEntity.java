package com.task.service.contact.entity;

import com.task.service.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class ContactEntity {

    private String contact;

    private String email;

    private String phone;
}
