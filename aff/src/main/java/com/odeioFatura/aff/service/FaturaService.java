package com.odeioFatura.aff.service;

import com.odeioFatura.aff.model.Fatura;
import com.odeioFatura.aff.repository.FaturaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FaturaService {
    private final FaturaRepository faturaRepository;
    public FaturaService(FaturaRepository faturaRepository){

        this.faturaRepository = faturaRepository;
    }

    public List<Fatura>listarTodas(){
        return faturaRepository.findAll();
    }

    public Fatura salvar(Fatura fatura) {
        return faturaRepository.save(fatura);
    }
}
