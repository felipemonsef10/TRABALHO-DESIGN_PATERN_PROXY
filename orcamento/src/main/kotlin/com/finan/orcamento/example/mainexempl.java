package com.finan.orcamento.example;

import com.finan.orcamento.model.OrcamentoModel;
import com.finan.orcamento.model.OrcamentoProxy;

public class mainexempl {
    public static void main(String[] args) {
        //Sem proxy
        OrcamentoModel orcamentoModel = new OrcamentoModel();
        System.out.println(orcamentoModel.getValorOrcamento());
        System.out.println(orcamentoModel.getDescontoOrcamento());
        System.out.println(orcamentoModel.getQtdItens());

        //Com proxy
        OrcamentoProxy proxy = new OrcamentoProxy(orcamentoModel);
        System.out.println(proxy.getValorOrcamento());
        System.out.println(proxy.getDescontoOrcamento());
        System.out.println(proxy.getQtdItens());
    }
}
