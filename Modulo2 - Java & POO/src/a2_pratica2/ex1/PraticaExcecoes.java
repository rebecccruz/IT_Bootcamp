package a2_pratica2.ex1;

public class PraticaExcecoes {

    public static void main(String[] args) {
        int a = 0, b = 300;

        try{
            double razao = b / a;
            System.out.println("A razao é " + razao);
        } catch (ArithmeticException e){
            throw new IllegalArgumentException("Nao pode ser dividido por zero.");
        } finally {
            System.out.println("Programa finalizado.");
       }
    }
}
