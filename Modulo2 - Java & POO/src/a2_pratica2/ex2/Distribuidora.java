package a2_pratica2.ex2;

import java.util.ArrayList;
import java.util.List;

public class Distribuidora {

    public static void main(String[] args) {

        double precoFinal = 0;
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Pereciveis("morango", 9.99, 3));
        produtos.add(new Pereciveis("banana", 4.99, 5));
        produtos.add(new NaoPereciveis("sal", 5.90, "não perecivel"));
        produtos.add(new NaoPereciveis("oleo", 8.90, "não perecivel"));

//     FOR EACH
//for(<Tipo> <identificação> : <array ou coleção>) {
//<comando>
//}

        for (Produto produto : produtos) {
            precoFinal += produto.getPreco();
        }

        System.out.println("O valor total é: R$ " + precoFinal);
    }
}
