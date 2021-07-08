package com.matheuscordeiro.loginuserapispringboot.controllers;

import com.matheuscordeiro.loginuserapispringboot.entities.Costumer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/costumers")
public class CostumerController {
    @GetMapping
    public ResponseEntity<List<Costumer>> getCostumers() {
        return ResponseEntity.ok(null);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Costumer> getCostumerById(@PathVariable Long id) {
        return ResponseEntity.ok(null);
    }

    @PostMapping
    public ResponseEntity<Costumer> saveCostumer(@RequestBody @Valid Costumer costumer) {
        return ResponseEntity.ok(null);
    }

    @PutMapping
    public ResponseEntity<Void> updateCostumer(@RequestBody @Valid Costumer costumer) {
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/id")
    public ResponseEntity<Void> deleteCostumerById(@PathVariable Long id) {
        return ResponseEntity.noContent().build();
    }
}
