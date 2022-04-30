package com.school.management.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@javax.persistence.Entity
@Table(name = "ogretmen")
public class OgretmenEntity extends KisiEntity {
    private String bolum;
    private String sicil;

}
