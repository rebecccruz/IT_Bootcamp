package assuntos.generics;

public class MinhaClasse<T> {
    T obj;

    public MinhaClasse(T obj) {
        this.obj = obj;
    }

    public T getObj(){
        return obj;
    }
}
