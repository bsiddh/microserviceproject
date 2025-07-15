package com.eazybytes.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@MappedSuperclass
//indicates the data jpa that this particular class is base class for all entity class
@Getter
@Setter
//above annotations are lombok
@ToString
//convers to string value
public class BaseEntity {
//false because date is not being updated in table so that while inserting data exact time of entered data to be stored
    @Column(updatable = false)
    private LocalDate createdAt;

    @Column(updatable = false)
    private String createdBy;

    @Column(insertable = false)
    private LocalDate updatedta;

    @Column(insertable = false)
    private String updatedBy;

}
