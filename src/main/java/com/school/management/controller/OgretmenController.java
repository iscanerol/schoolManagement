package com.school.management.controller;

import com.school.management.model.entity.OgretmenEntity;
import com.school.management.service.OgretmenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/ogretmen")
public class OgretmenController {

    @Autowired
    private OgretmenService ogretmenService;

    @PostMapping(path = "/ogretmenEkle")
    public ResponseEntity<String> ogretmenEkle(@RequestBody OgretmenEntity ogretmen) {
        return ResponseEntity.ok(ogretmenService.ogretmenEkle(ogretmen));
    }

    @GetMapping(path = "/ogretmenList")
    public ResponseEntity<List<OgretmenEntity>> ogretmenList() {
        List<OgretmenEntity> ogretmenList = ogretmenService.ogretmenListesi();
        return ResponseEntity.ok(ogretmenList);

    }

    @GetMapping(path = "/bul/{sicilNo}")
    public ResponseEntity<OgretmenEntity> ogrenciListesi(@PathVariable("sicilNo") String sicilNo) {
        OgretmenEntity ogretmen = ogretmenService.ogretmenBul(sicilNo);
        return ResponseEntity.ok(ogretmen);
    }

    @PutMapping(path = "/update")
    public ResponseEntity<String> ogretmenUpdate(@RequestBody OgretmenEntity ogretmen) {
        String type = ogretmenService.upDate(ogretmen);
        return ResponseEntity.ok(type);
    }
    @GetMapping(path = "/ogretmenListSirali")
    public ResponseEntity<List<OgretmenEntity>> ogretmenListSirali() {
        List<OgretmenEntity> ogretmenList = ogretmenService.ogretmenListesiSirali();
        return ResponseEntity.ok(ogretmenList);

    }

}

