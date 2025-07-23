package com.example.backend.repository;

import com.example.backend.model.Dado;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class DadoRepositorio {

    private final List<Dado> dados = new ArrayList<>();

    public List<Dado> listar(){
        return dados;
    }

    public void adicionar(Dado dado){
        dados.add(dado);
    }

    public boolean removerPorId(String id){
        return dados.removeIf(d -> d.getId().equals(id));
    }

    public void atualizar(Dado novoDado){
        for(int i = 0; i < dados.size(); i++){
            if(dados.get(i).getId().equals(novoDado.getId())){
                dados.set(i, novoDado);
                return;
            }
        }
    }

}
