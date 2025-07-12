package com.example.backend.repository;

import com.example.backend.model.Dado;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class DadoRepositorio {

    private static final List<Dado> lista = new ArrayList<>();

    static {
        lista.add(new Dado("1", "Item 1"));
        lista.add(new Dado("2", "Item 2"));
    }

    public List<Dado> listarTodos(){
        return lista;
    }

    public void adicionar(Dado dado){
        lista.add(dado);
    }

    public boolean removerPorId(String id){
        return lista.removeIf(d -> d.getId().equals(id));
    }

    public Optional<Dado> buscarPorId(String id){
        return lista.stream().filter(d -> d.getId().equals(id)).findFirst();
    }
}
