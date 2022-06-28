package a3_pratica1.ex1.cliente;

import a3_pratica1.ex1.transacao.ConsultaSaldo;
import a3_pratica1.ex1.transacao.SaqueDinheiro;

public class Cobrador extends Cliente implements ConsultaSaldo, SaqueDinheiro {

    @Override
    public void ConsultaSaldo() {

    }

    @Override
    public void SaqueDinheiro() {

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
