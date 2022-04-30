package com.school.management.controller;

import com.school.management.model.entity.OgrenciEntity;
import com.school.management.service.OgrenciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/ogrenci")
public class OgrenciController {

    @Autowired
    private OgrenciService ogrenciService;

    @PostMapping(path = "/ogrenciEkle")
    public ResponseEntity<String> ogretmenEkle(@RequestBody OgrenciEntity ogrenci) {
        return ResponseEntity.ok(ogrenciService.ogrenciEkle(ogrenci));
    }

    @GetMapping(path = "/ogrenciList")
    public ResponseEntity<List<OgrenciEntity>> ogrenciListesi() {
        List<OgrenciEntity> ogrenciList = ogrenciService.ogrenciListesi();
        return ResponseEntity.ok(ogrenciList);
    }

    @GetMapping(path = "/bul/{ogrenciNo}/{sinif}") // localhost8080/ogrenci/bul/123/5
    public ResponseEntity<OgrenciEntity> ogrenciListesi(@PathVariable("ogrenciNo") String ogrenciNo) {
        OgrenciEntity ogrenci = ogrenciService.ogrenciBul(ogrenciNo);
        return ResponseEntity.ok(ogrenci);
    }

    @GetMapping(path = "/bul")  // localhost8080/ogrenci/bul?ogrenciNo=123?sinif=5
    public ResponseEntity<OgrenciEntity> ogrenciListesi2(@RequestParam("ogrenciNo") String ogrenciNo,
                                                         @RequestParam("sinif")String sinif) {
        OgrenciEntity ogrenci = ogrenciService.ogrenciBul(ogrenciNo);
        return ResponseEntity.ok(ogrenci);
    }
}
