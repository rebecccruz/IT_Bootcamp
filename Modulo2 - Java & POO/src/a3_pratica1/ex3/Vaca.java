package a3_pratica1.ex3;

public class Vaca extends Animal implements Herbivoros {

    @Override
    public String emitirSom() {
        return "mu";
    }

    @Override
    public String comerPasto() {
        return "O animal é herbívoro";
    }
}
