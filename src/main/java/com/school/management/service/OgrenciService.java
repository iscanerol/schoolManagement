package com.school.management.service;

import com.school.management.model.entity.OgrenciEntity;
import com.school.management.repository.OgrenciRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OgrenciService {

    @Autowired
    private OgrenciRepository ogrenciRepository;

    //public OgrenciService(OgrenciRepository ogrenciRepository) {
        //this.ogrenciRepository = ogrenciRepository;
   // }

    public String ogrenciEkle(OgrenciEntity ogrenci) {
        ogrenciRepository.save(ogrenci);
        return "Ogrenci kaydedildi";
    }

    public List<OgrenciEntity> ogrenciListesi() {
        List<OgrenciEntity> ogrenciList = ogrenciRepository.findAll();
        return ogrenciList;
    }

    public OgrenciEntity ogrenciBul(String ogrenciNo) {
        OgrenciEntity ogrenci = ogrenciRepository.findByOgrenciNo(ogrenciNo);
        return ogrenci;
    }
}
