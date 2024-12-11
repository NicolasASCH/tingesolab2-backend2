package nasch.prestabanco.totalcost_service.controllers;

import nasch.prestabanco.totalcost_service.services.TotalcostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/total_cost")
public class TotalcostController {
    @Autowired
    TotalcostService totalcostService;

    @PostMapping("/")
    public ResponseEntity<Double> costCalculation(@PathVariable long amount,
                                                  @PathVariable float interest_rate,
                                                  @PathVariable int term) {
        return ResponseEntity.ok(totalcostService.totalCostCalculation(amount, interest_rate, term));
    }
}