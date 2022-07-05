package assuntos.wrapper;

public class Exemplo01 {
    public static void main(String[] args) {
        int n = 10;

        // Integer integer = new Integer(10); deprecated
        Integer integer = 10; //autoboxing: boxing conversion
        int valor = integer.intValue();
        valor = integer; //autoboxing: unboxing conversion

        System.out.println(integer);
        System.out.println(valor);

        int numero = Integer.parseInt("123");

        String texto = Integer.toString(123);
        String texto2 = 123 + "";

        Integer n1 = 200;
        Integer n2 = 200;

        System.out.println(n1 == n2);
        System.out.println(n1.equals(n2));

    }
}
