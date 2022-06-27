package a2_pratica1;

//exercicio 3 - criar classe Main
public class Main {

    //exercicio 4 - criar objeto pessoa dentro do metodo main
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa("Rebecca", 27, "1");
        Pessoa pessoa3 = new Pessoa("Felipe", 31, "2", 70, 165);

        if (pessoa3.ehMaioridade()){
            System.out.println(pessoa3.getNome() + " é maior de idade.");
        }
        else {
            System.out.println(pessoa3.getNome() + " é menor de idade.");
        }

        if (pessoa3.calcularIMC() == -1){
            System.out.println("Referencia IMC: abaixo do peso");
        } else if (pessoa3.calcularIMC() == 0){
            System.out.println("Referencia IMC: peso saudável");
        } else if (pessoa3.calcularIMC() == 1){
            System.out.println("Referencia IMC: sobrepeso");
        }
    }
}
