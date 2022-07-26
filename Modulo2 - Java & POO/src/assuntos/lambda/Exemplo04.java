package assuntos.lambda;

public class Exemplo04 {

    interface InterffaceString {
        String executar(String str);
    }

    public static void imprimir(String texto, InterffaceString inter) {
        String resultado = inter.executar(texto);
        System.out.println(resultado);
    }

    public static void main(String[] args) {
        InterffaceString mudar = s -> s + "complemento";
        imprimir("Meu texto", mudar);
    }
}
