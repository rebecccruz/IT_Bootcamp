package a2_pratica1;

//exercicio 1 - criar atributos
public class Pessoa {
    String nome;
    int idade;
    String id;
    double peso;
    int altura;

    // exercicio 2 - criar construtores
    public Pessoa() {
    }

    public Pessoa(String nome, int idade, String id) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
    }

    public Pessoa(String nome, int idade, String id, double peso, int altura) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
        this.peso = peso;
        this.altura = altura;
    }

    //exercicio 5 - calcularIMC e maioridade
    public double calcularIMC() {
        double imc = peso / Math.pow(2, altura);

        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        }
        return 1;
    }

    public boolean ehMaioridade() {
        if (idade >= 18) {
            return true;
        }
        return false;
    }


    //exercicio 6 - mostrar dados
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }


}
