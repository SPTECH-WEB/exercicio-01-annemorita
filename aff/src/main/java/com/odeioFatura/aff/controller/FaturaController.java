package com.odeioFatura.aff.controller;

import com.odeioFatura.aff.model.Fatura;
import com.odeioFatura.aff.service.FaturaService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faturas")
public class FaturaController {

    private final FaturaService faturaService;
    public FaturaController(FaturaService faturaService){this.faturaService = faturaService;}


    @GetMapping
    public List<Fatura> listarFaturas(){return faturaService.listarTodas();}

    @PostMapping
    public ResponseEntity<Fatura>cadastrar(@Valid @RequestBody Fatura fatura) {
        Fatura novaFatura = faturaService.salvar(fatura);
        return ResponseEntity.ok(novaFatura);
    }
}
