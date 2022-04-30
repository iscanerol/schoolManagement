package com.school.management.model.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter

public class OgrenciDto extends KisiDto {


    @Column(name = "class")
    private String sinif;
    private String ogrenciNo;

}
