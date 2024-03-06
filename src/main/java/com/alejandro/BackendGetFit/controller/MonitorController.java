package com.alejandro.BackendGetFit.controller;

import com.alejandro.BackendGetFit.entity.Monitor;
import com.alejandro.BackendGetFit.services.MonitorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/monitores")
public class MonitorController {

    private final MonitorService monitorService;

    @GetMapping
    public List<Monitor> getAllMonitores() {
        return monitorService.getAllMonitores();
    }

    @PostMapping
    public void createMonitores(@RequestBody Monitor monitor) {
        monitorService.createMonitor(monitor);
    }

}
