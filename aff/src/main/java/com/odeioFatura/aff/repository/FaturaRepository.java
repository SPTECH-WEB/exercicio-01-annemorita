package com.odeioFatura.aff.repository;

import com.odeioFatura.aff.model.Fatura;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FaturaRepository extends JpaRepository<Fatura, Long> {

}
