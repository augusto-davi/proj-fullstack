package com.example.backend.controller;

import com.example.backend.model.Dado;
import com.example.backend.repository.DadoRepositorio;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/dados")
@CrossOrigin(origins = "http://localhost:4200")
public class DadosController {

    private final DadoRepositorio repositorio;

    public DadosController(DadoRepositorio repositorio){
        this.repositorio = repositorio;
    }

    @GetMapping
    public List<Dado> listar(){
        return repositorio.listarTodos();
    }

    @PostMapping
    public void adicionar(@RequestBody Dado dado){
        repositorio.adicionar(dado);
    }

    @DeleteMapping("/{id}")
    public void remover(@PathVariable String id){
        repositorio.removerPorId(id);
    }
}
