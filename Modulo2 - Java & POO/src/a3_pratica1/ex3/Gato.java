package a3_pratica1.ex3;

public class Gato extends Animal implements Carnivoros {

    @Override
    public String emitirSom() {
        return "miau";
    }

    @Override
    public String comerCarne() {
        return "O animal é carnívoro";
    }
}
