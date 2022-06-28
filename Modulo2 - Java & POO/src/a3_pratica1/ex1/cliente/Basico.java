package a3_pratica1.ex1.cliente;

import a3_pratica1.ex1.transacao.ConsultaSaldo;
import a3_pratica1.ex1.transacao.PagamentoServico;
import a3_pratica1.ex1.transacao.SaqueDinheiro;

public class Basico extends Cliente implements ConsultaSaldo, PagamentoServico, SaqueDinheiro {

    @Override
    public void ConsultaSaldo() {

    }


    @Override
    public void SaqueDinheiro() {

    }

    @Override
    public void PagamentoServico() {

    }

    @Override
    public boolean TransacaoOk() {
        return false;
    }

    @Override
    public boolean TransacaoNaoOk() {
        return false;
    }

}
