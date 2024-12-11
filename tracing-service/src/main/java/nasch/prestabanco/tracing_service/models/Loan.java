package nasch.prestabanco.tracing_service.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Loan {
    private Long id;
    private String rut;
    private String type;
    private long propertyPrice;
    private long amount;
    private int term;
    private float interestRate;
    private long income;
    private int workingTime;
    private int age;
    private String state;
    private byte[] document1;
    private byte[] document2;
    private byte[] document3;
    private byte[] document4;
}
