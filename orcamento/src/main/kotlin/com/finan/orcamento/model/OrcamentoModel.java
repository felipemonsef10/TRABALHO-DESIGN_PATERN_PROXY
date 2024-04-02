package com.finan.orcamento.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Entity
@Table(name = "orcamento")
public class OrcamentoModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "quantidade_itens")
    private int quantidadeItens;

    @NotNull
    @Column(name = "valor_orcamento")
    private BigDecimal valorOrcamento;

    @Column(name = "desconto_orcamento")
    private BigDecimal descontoOrcamento;

    public void setQuantidadeItens(int quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }

    public void setValorOrcamento(BigDecimal valorOrcamento) {
        this.valorOrcamento = valorOrcamento;
    }

    public void setDescontoOrcamento(BigDecimal descontoOrcamento) {
        this.descontoOrcamento = descontoOrcamento;
    }
}
