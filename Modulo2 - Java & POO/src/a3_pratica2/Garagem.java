package a3_pratica2;

import java.util.ArrayList;
import java.util.List;

public class Garagem {
    int id;
    List<Veiculo> veiculos = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public void addVeiculo(Veiculo veiculo){
        veiculos.add(veiculo);
    }

}
