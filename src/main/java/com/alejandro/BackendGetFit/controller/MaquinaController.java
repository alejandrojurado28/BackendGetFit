package com.alejandro.BackendGetFit.controller;

import com.alejandro.BackendGetFit.entity.Maquina;
import com.alejandro.BackendGetFit.services.MaquinaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/maquinas")
public class MaquinaController {

    private final MaquinaService maquinaService;

    @GetMapping
    public List<Maquina> getAllMaquinas() {
        return maquinaService.getAllMaquinas();
    }

    @PostMapping
    public void createMaquina(@RequestBody Maquina maquina) {
        maquinaService.createMaquina(maquina);
    }
}
