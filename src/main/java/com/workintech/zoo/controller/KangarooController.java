package com.workintech.zoo.controller;

import com.workintech.zoo.entity.Kangaroo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kangaroo")
@AllArgsConstructor
@Data
public class KangarooController {

    private Map<Integer, Kangaroo> kangaroos;

    public void Kangaroo() {
        kangaroos = new HashMap<>();
        this.kangaroos.put(1, new Kangaroo(1,"Berk",30.30, 30,"male",true));
        this.kangaroos.put(1, new Kangaroo(2,"Berke",40.30, 40,"female",false));
    }

    @GetMapping
    public List<Kangaroo> getKangaroo(){
        return new ArrayList<>(kangaroos.values());
    }
    @GetMapping("{id}")
    public List<Kangaroo> getKangaroo(@PathVariable Integer id){
        return new ArrayList<>(id);
    }
    @PostMapping
    public String addKangaroo(@RequestBody Kangaroo kangaroo){
        int id = kangaroo.getId();
        kangaroos.put(id,kangaroo);
        return "Kangaroo added" + id;
    }
    @PutMapping("/{id}")
    public String updateKangaroo(@PathVariable int id, @RequestBody Kangaroo updatedKangaroo) {
        if (kangaroos.containsKey(id)) {
            kangaroos.put(id, updatedKangaroo);
            return "Kangaroo with ID " + id + " updated successfully.";
        } else {
            return "Kangaroo with ID " + id + " not found.";
        }
    }
    @DeleteMapping("/{id}")
    public String deleteKangaroo(@PathVariable int id) {
        if (kangaroos.containsKey(id)) {
            kangaroos.remove(id);
            return "Kangaroo with ID " + id + " deleted successfully.";
        } else {
            return "Kangaroo with ID " + id + " not found.";
        }
    }

}
