import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class WageEmployee extends Employee{
    private double hours;
    private double wage;

    public WageEmployee(String name, int age, boolean married, String company, String position, double baseSalary) {
        super(name, age, married, company, position, baseSalary);
    }

    public double calculateSalary() {
        return baseSalary + hours * wage;
    }
}
