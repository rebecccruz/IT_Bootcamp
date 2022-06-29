package a3_pratica1.ex3;

public class Cachorro extends Animal implements Carnivoros {

    @Override
    public String emitirSom() {
        return "auau";
    }

    @Override
    public String comerCarne() {
        return "O animal é carnívoro";
    }
}
