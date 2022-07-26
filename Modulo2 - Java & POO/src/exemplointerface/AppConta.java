package exemplointerface;

import exemplointerface.modelo.Conta;
import exemplointerface.modelo.ContaCorrente;
import exemplointerface.modelo.ContaEspecial;
import exemplointerface.util.MongoDB;
import exemplointerface.util.MySQL;

import java.util.ArrayList;
import java.util.HashMap;

public class AppConta {

    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente(111);
        ContaEspecial ce1 = new ContaEspecial(222, 1000);

        MySQL mySQL = new MySQL();
        MongoDB mongoDB = new MongoDB();

        ArrayList<Conta> contas = new ArrayList();
        HashMap<Integer, Conta> mapadeContas = new HashMap<>();


        contas.add(cc1);
        contas.add(ce1);

        mapadeContas.put(cc1.getNumero(), cc1);
        mapadeContas.put(ce1.getNumero(), ce1);

//        for (int i = 0; i < contas.size(); i++){
//            System.out.println("Conta: " + contas.get(i).getNumero());
//        }

        for (Conta c : contas) {
            System.out.println("Conta: " + c.getNumero());
        }

        Conta contaEncontrada = mapadeContas.get(111);
        System.out.println("Conta encontrada no HashMap");

//        cc1.gravar(mySQL);
//        ce1.gravar(mongoDB);
    }
}
