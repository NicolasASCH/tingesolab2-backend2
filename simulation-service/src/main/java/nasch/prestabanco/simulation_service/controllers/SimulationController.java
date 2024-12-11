package nasch.prestabanco.simulation_service.controllers;

import nasch.prestabanco.simulation_service.services.SimulationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/simulation")
public class SimulationController {
    @Autowired
    SimulationService simulationService;

    @PostMapping("/")
    public ResponseEntity<Double> simulateCredit(@RequestParam("amount") long amount,
                                                 @RequestParam("interest_rate") float interest_rate,
                                                 @RequestParam("term") int term) {
        return ResponseEntity.ok(simulationService.mortgageCreditSimulation(amount, interest_rate, term));
    }
}