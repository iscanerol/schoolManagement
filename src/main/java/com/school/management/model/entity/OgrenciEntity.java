package com.school.management.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@javax.persistence.Entity
@Table(name = "ogrenci")
public class OgrenciEntity extends KisiEntity {


    @Column(name = "class")
    private String sinif;
    private String ogrenciNo;


}
