package nasch.prestabanco.simulation_service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;

@Service
public class SimulationService {
    public double mortgageCreditSimulation(long amount, float interest_rate, int term) {
        if (amount <= 0.0 || interest_rate <= 0.0 || term <= 0) {
            throw new IllegalArgumentException("Ingrese valores en los parametros que no sean 0");
        }
        float r = (interest_rate / 12) / 100;
        int n = term * 12;

        return amount * ((r * Math.pow((1 + r), n)) / (Math.pow((1 + r), n) - 1));
    }
}