package assuntos.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Exemplo02 {
    public static void main(String[] args) {
        MinhaClasse<Integer> obj1 = new MinhaClasse(123);
        MinhaClasse<String> obj2 = new MinhaClasse("Texto");

        System.out.println(obj1.getObj());
        System.out.println(obj2.getObj());

        List<?> lista = new ArrayList();
        HashMap<Integer, String> mapa = new HashMap<>();

    }
}
