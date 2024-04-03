package com.finan.orcamento.model;

import java.math.BigDecimal;

public class OrcamentoProxy extends OrcamentoModel{
    private BigDecimal valorOrcamento;
    private OrcamentoModel orcamentoModel;

    public OrcamentoProxy(OrcamentoModel orcamentoModel) {
        this.orcamentoModel = orcamentoModel;
    }

    @Override
    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    @Override
    public void setValorOrcamento(BigDecimal valorOrcamento) {
        this.valorOrcamento = valorOrcamento;
    }
}
