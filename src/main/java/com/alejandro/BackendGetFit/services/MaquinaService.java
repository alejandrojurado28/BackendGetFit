package com.alejandro.BackendGetFit.services;

import com.alejandro.BackendGetFit.entity.Maquina;
import com.alejandro.BackendGetFit.repository.MaquinaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MaquinaService {

    private final MaquinaRepository maquinaRepository;

    public void createMaquina(Maquina maquina) {
        maquinaRepository.save(maquina);
    }

    public List<Maquina> getAllMaquinas() {
        return maquinaRepository.findAll();
    }

}
