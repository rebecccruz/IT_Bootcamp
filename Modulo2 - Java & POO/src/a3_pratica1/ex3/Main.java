package a3_pratica1.ex3;

public class Main {

    public static void main(String[] args) {
        Vaca vaca = new Vaca();
        Gato gato = new Gato();
        Cachorro cachorro = new Cachorro();

        System.out.println(vaca.comerPasto());
        System.out.println(vaca.emitirSom());
        System.out.println(gato.comerCarne());
        System.out.println(gato.emitirSom());
        System.out.println(cachorro.comerCarne());
        System.out.println(cachorro.emitirSom());

    }
}
