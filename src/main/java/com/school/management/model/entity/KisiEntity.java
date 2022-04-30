package com.school.management.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class KisiEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//otomatik id versin diye kullanilan anotasyon

    private Long id;
    private String isim;
    private String soyisim;
    private int yas;


}
