package com.matheuscordeiro.loginuserapispringboot.controllers;

import com.matheuscordeiro.loginuserapispringboot.entities.Costumer;
import com.matheuscordeiro.loginuserapispringboot.exceptions.ObjectNotFoundException;
import com.matheuscordeiro.loginuserapispringboot.services.interfaces.CostumerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/costumers")
public class CostumerController {
    private CostumerService costumerService;

    public  CostumerController(CostumerService costumerService) {
        this.costumerService = costumerService;
    }

    @GetMapping
    public ResponseEntity<List<Costumer>> getCostumers() throws ObjectNotFoundException {
        return ResponseEntity.ok(costumerService.findAllCostumerOrThrow());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Costumer> getCostumerById(@PathVariable Long id) throws ObjectNotFoundException {
        return ResponseEntity.ok(costumerService.findByIdCostumerOrThrow(id).get());
    }

    @PostMapping
    public ResponseEntity<Costumer> saveCostumer(@RequestBody @Valid Costumer costumer) {
        return ResponseEntity.ok(costumerService.saveCostumerOrThrow(costumer));
    }

    @PutMapping
    public ResponseEntity<Void> updateCostumer(@RequestBody @Valid Costumer costumer) {
        costumerService.updateCostumerOrThrow(costumer);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/id")
    public ResponseEntity<Void> deleteCostumerById(@PathVariable Long id) {
        costumerService.deleteCostumerByIdOrThrow(id);
        return ResponseEntity.noContent().build();
    }
}
