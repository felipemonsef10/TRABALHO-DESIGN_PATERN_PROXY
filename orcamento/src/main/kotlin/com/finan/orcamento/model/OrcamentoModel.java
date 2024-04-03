package com.finan.orcamento.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;


import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "orcamento")
public class OrcamentoModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "quantidade_itens")
    private int qtdItens;

    @NotNull
    @Column(name = "valor_orcamento")
    private BigDecimal valorOrcamento;

    @Column(name = "desconto_orcamento")
    private BigDecimal descontoOrcamento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQtdItens() {
        return qtdItens;
    }

    public void setQtdItens(int qtdItens) {
        this.qtdItens = qtdItens;
    }

    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    public void setValorOrcamento(BigDecimal valorOrcamento) {
        this.valorOrcamento = valorOrcamento;
    }

    public BigDecimal getDescontoOrcamento() {
        return descontoOrcamento;
    }

    public void setDescontoOrcamento(BigDecimal descontoOrcamento) {
        this.descontoOrcamento = descontoOrcamento;
    }

 }
