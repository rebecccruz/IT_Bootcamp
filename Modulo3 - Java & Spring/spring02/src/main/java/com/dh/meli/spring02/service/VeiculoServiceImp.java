package com.dh.meli.spring02.service;

import com.dh.meli.spring02.dto.VeiculoDto;
import com.dh.meli.spring02.model.Veiculo;
import com.dh.meli.spring02.repository.VeiculoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VeiculoServiceImp implements VeiculoService {

    @Autowired
    private VeiculoRepo repo;

    @Override
    public VeiculoDto getVeiculo(String placa) {
        VeiculoDto veiculoDto = new VeiculoDto(repo.getVeiculo(placa));
        return veiculoDto;
    }

    @Override
    public List<VeiculoDto> getAllVeiculo() {
        List<Veiculo> listaVeiculos = repo.getAllVeiculo();
        List<VeiculoDto> listaDto = listaVeiculos.stream()
                .map(VeiculoDto::new).collect(Collectors.toList());

        return listaDto;
    }

    @Override
    public void saveVeiculo(Veiculo novoVeiculo) {
        repo.saveVeiculo(novoVeiculo);
    }

    @Override
    public List<VeiculoDto> getAllOrderByValor() {
        List<Veiculo> listaVeiculos = repo.getAllVeiculo();
        return listaVeiculos.stream()
                .sorted()
                .map(VeiculoDto::new)
                .collect(Collectors.toList());
    }

    @Override
    public List<VeiculoDto> getAllOrderByModelo() {
        List<Veiculo> listaVeiculos = repo.getAllVeiculo();
        return listaVeiculos.stream()
                .sorted( (v1,v2) -> v1.getModelo().compareTo(v2.getModelo()))
                .map(VeiculoDto::new)
                .collect(Collectors.toList());
    }

    @Override
    public List<VeiculoDto> getByModelo(String modelo) {
        List<Veiculo> listaVeiculos = repo.getAllVeiculo();
        return listaVeiculos.stream()
                .filter( v -> v.getModelo().equalsIgnoreCase(modelo))
                .map(VeiculoDto::new)
                .collect(Collectors.toList());
    }
}
