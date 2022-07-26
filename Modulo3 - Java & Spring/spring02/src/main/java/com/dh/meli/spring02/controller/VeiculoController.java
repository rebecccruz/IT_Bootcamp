package com.dh.meli.spring02.controller;

import com.dh.meli.spring02.dto.VeiculoDto;
import com.dh.meli.spring02.model.Veiculo;
import com.dh.meli.spring02.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculo")
public class VeiculoController {

    @Autowired
    private VeiculoService service;

    @GetMapping("/{placa}")
    public ResponseEntity<VeiculoDto> getVeiculo(@PathVariable String placa) {
        return ResponseEntity.ok().body(service.getVeiculo(placa));
    }

    @GetMapping("/all")
    public ResponseEntity<List<VeiculoDto>> getAllVeiculo() {
        List<VeiculoDto> lista = service.getAllVeiculo();
        return ResponseEntity.ok(lista);
    }

    @GetMapping("/alloder")
    public ResponseEntity<List<VeiculoDto>> getAllVeiculoOrder() {
        List<VeiculoDto> lista = service.getAllOrderByValor();
        return ResponseEntity.ok(lista);
    }

    @GetMapping("/allbymodel")
    public ResponseEntity<List<VeiculoDto>> getAllVeiculoOrderByModelo() {
        List<VeiculoDto> lista = service.getAllOrderByModelo();
        return ResponseEntity.ok(lista);
    }


    @GetMapping("/bymodel/{modelo}")
    public ResponseEntity<List<VeiculoDto>> getByModelo(@PathVariable String modelo) {
        List<VeiculoDto> lista = service.getByModelo(modelo);
        return ResponseEntity.ok(lista);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void saveVeiculo(@RequestBody Veiculo novoVeiculo) {
        service.saveVeiculo(novoVeiculo);
    }

}
