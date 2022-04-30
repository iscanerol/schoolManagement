package com.school.management.service;

import com.school.management.exception.ResultStringException;
import com.school.management.model.entity.KisiEntity;
import com.school.management.model.entity.OgretmenEntity;
import com.school.management.repository.OgretmenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OgretmenService {
    @Autowired
    private OgretmenRepository ogretmenRepository;


   // public OgretmenService(OgretmenRepository ogretmenRepository){
     //   this.ogretmenRepository = ogretmenRepository;
   // }

    public String ogretmenEkle(OgretmenEntity ogretmen) {
        ogretmenRepository.save(ogretmen);
        return "Ogretmen kaydedildi.";
    }
    public List<OgretmenEntity> ogretmenListesi(){
        List<OgretmenEntity>ogretmenList = ogretmenRepository.findAll();
        return ogretmenList;
    }
    public OgretmenEntity ogretmenBul(String sicilNo){
        OgretmenEntity ogretmen = ogretmenRepository.findBySicil(sicilNo);
        if(ogretmen==null){
            throw new ResultStringException("Öğretmen bulunamadı!!!!!!!");
        }
        return ogretmen;
    }
    public String upDate(OgretmenEntity ogretmen){
        ogretmenRepository.save(ogretmen);
        return "degistirildi";
    }
    public List<OgretmenEntity> ogretmenListesiSirali() {
        List<OgretmenEntity> ogretmenList = ogretmenRepository.findAll();
        ogretmenList =   ogretmenList.stream().sorted(Comparator.comparing(KisiEntity::getIsim)).collect(Collectors.toList());
        return ogretmenList;
    }
}
