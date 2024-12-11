package nasch.prestabanco.tracing_service.controllers;

import nasch.prestabanco.tracing_service.models.Loan;
import nasch.prestabanco.tracing_service.services.TracingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tracing")
public class TracingController {

    @Autowired
    private TracingService tracingService;

    @GetMapping("/{rut}")
    public ResponseEntity<List<Loan>> getLoansByRut(@PathVariable("rut") String rut) {
        List<Loan> loans = tracingService.getLoansByRut(rut);
        return ResponseEntity.ok(loans);
    }
}
