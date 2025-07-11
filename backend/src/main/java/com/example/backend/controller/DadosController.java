package com.example.backend.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/dados")
@CrossOrigin(origins = "http://localhost:4200")
public class DadosController {

    @GetMapping
    public List<Map<String, String>> listarDados() {
        List<Map<String, String>> dados = new ArrayList<>();

        Map<String, String> item1 = new HashMap<>();
        item1.put("id", "1");
        item1.put("nome", "Item 1");

        Map<String, String> item2 = new HashMap<>();
        item2.put("id", "2");
        item2.put("nome", "Item 2");

        dados.add(item1);
        dados.add(item2);

        return dados;
    }
}
