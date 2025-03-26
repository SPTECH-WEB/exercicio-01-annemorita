package com.odeioFatura.aff.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "faturas")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class Fatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O numero do cartao não pode estar em branco")
    @Pattern(regexp = "\\d{16}", message = "O numero do cartao deve ter 16 digitos")
    private String numeroCartao;

    @NotBlank(message = "O nome do titular não pode estar em branco")
    @Size(min = 3, max = 300, message = "o nome do titular deve possuir entre 3 e 100 digitos")
    private String nomeTitular;

    @NotNull(message = "O valor não pode ser nulo")
    @DecimalMin(value = "10.0", message = "o valor minimo é de 10 reais")
    @DecimalMax(value = "5000.00", message = "o valor maximo é de 5 mil reais")
    private Double valor;


    @NotNull(message = "A data não pode ser Nula")
    @FutureOrPresent(message = "A data de pagamento deve ser a data atual ou futura")
    private LocalDate dataPagamento;


    @NotBlank(message = "O email não pode estar em branco")
    @Email(message = "O e-mail deve ser válido.")
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "O numero do cartao não pode estar em branco") @Pattern(regexp = "\\d{16}", message = "O numero do cartao deve ter 16 digitos") String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(@NotBlank(message = "O numero do cartao não pode estar em branco") @Pattern(regexp = "\\d{16}", message = "O numero do cartao deve ter 16 digitos") String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public @NotBlank(message = "O nome do titular não pode estar em branco") @Size(min = 3, max = 300, message = "o nome do titular deve possuir entre 3 e 100 digitos") String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(@NotBlank(message = "O nome do titular não pode estar em branco") @Size(min = 3, max = 300, message = "o nome do titular deve possuir entre 3 e 100 digitos") String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public @NotNull(message = "O valor não pode ser nulo") @DecimalMin(value = "10.0", message = "o valor minimo é de 10 reais") @DecimalMax(value = "5000.00", message = "o valor maximo é de 5 mil reais") Double getValor() {
        return valor;
    }

    public void setValor(@NotNull(message = "O valor não pode ser nulo") @DecimalMin(value = "10.0", message = "o valor minimo é de 10 reais") @DecimalMax(value = "5000.00", message = "o valor maximo é de 5 mil reais") Double valor) {
        this.valor = valor;
    }

    public @NotNull(message = "A data não pode ser Nula") @FutureOrPresent(message = "A data de pagamento deve ser a data atual ou futura") LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(@NotNull(message = "A data não pode ser Nula") @FutureOrPresent(message = "A data de pagamento deve ser a data atual ou futura") LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public @NotBlank(message = "O email não pode estar em branco") @Email(message = "O e-mail deve ser válido.") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "O email não pode estar em branco") @Email(message = "O e-mail deve ser válido.") String email) {
        this.email = email;
    }
}
