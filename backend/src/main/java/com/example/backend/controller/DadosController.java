package com.example.backend.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/dados")
@CrossOrigin(origins = "http://localhost:4200")
public class DadosController{
    @GetMapping
    public List<Map<String, String>> listarDados(){
        return List.of(
                Map.of("id", "1", "nome", "Item 1"),
                Map.of("id", "2", "nome", "Item 2")
        );
    }
}