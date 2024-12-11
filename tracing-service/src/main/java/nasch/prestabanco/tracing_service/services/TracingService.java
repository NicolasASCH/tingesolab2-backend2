package nasch.prestabanco.tracing_service.services;

import nasch.prestabanco.tracing_service.models.Loan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@Service
public class TracingService {

    @Autowired
    private RestTemplate restTemplate;

    public ArrayList<Loan> getLoansByRut(String rut) {
        ArrayList<Loan> loans = restTemplate.getForObject("http://loans-service/loans/" + rut, ArrayList.class);
        return loans;
    }
}
