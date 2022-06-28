package a3_pratica1.ex1.cliente;

import a3_pratica1.ex1.transacao.Deposito;
import a3_pratica1.ex1.transacao.Transferencia;

public class Executivo extends Cliente implements Deposito, Transferencia {

    @Override
    public void Deposito() {

    }

    @Override
    public boolean TransacaoOk() {
        return false;
    }

    @Override
    public boolean TransacaoNaoOk() {
        return false;
    }

    @Override
    public void Transferencia() {

    }
}
