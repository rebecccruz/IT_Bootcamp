package a2_pratica2.ex2;

public class Produto {

        String nome;
        double preco;

    public Produto (String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public double calcular(int quantidadeDeProdutos){
        return preco*quantidadeDeProdutos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto: {" +
                "nome: '" + nome + '\'' +
                ", preco: " + preco +
                '}';
    }

}
