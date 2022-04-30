package com.school.management.model.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.MappedSuperclass;

@Getter
@Setter

@MappedSuperclass
public class KisiDto {

    private Long id;
    private String isim;
    private String soyisim;
    private int yas;
}