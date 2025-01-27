package com.workintech.zoo.controller;


import com.workintech.zoo.entity.Kangaroo;
import com.workintech.zoo.entity.Koala;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/koala")
@AllArgsConstructor
@Data
public class KoalaController {
    private Map<Integer, Koala> koalas;

    public void Koalas() {
        koalas = new HashMap<>();
        this.koalas.put(1, new Koala(1,"Berk",30.30, 15,"male"));
        this.koalas.put(2, new Koala(2,"Berke",40.30, 16,"female"));
    }

    @GetMapping
    public List<Koala> getKoala(){
        return new ArrayList<>(koalas.values());
    }
    @GetMapping("{id}")
    public List<Koala> getKoala(@PathVariable Integer id){
        return new ArrayList<>(id);
    }
    @PostMapping
    public String addKoala(@RequestBody Koala koala){
        int id = koala.getId();
        koalas.put(id,koala);
        return "Koala added" + id;
    }
    @PutMapping("/{id}")
    public String updateKoala(@PathVariable int id, @RequestBody Koala updateKoala) {
        if (koalas.containsKey(id)) {
            koalas.put(id, updateKoala);
            return "Koala with ID " + id + " updated successfully.";
        } else {
            return "Koala with ID " + id + " not found.";
        }
    }
    @DeleteMapping("/{id}")
    public String deleteKoala(@PathVariable int id) {
        if (koalas.containsKey(id)) {
            koalas.remove(id);
            return "Koala with ID " + id + " deleted successfully.";
        } else {
            return "Koala with ID " + id + " not found.";
        }
    }

}
