import lombok.NonNull;
import lombok.experimental.UtilityClass;

import java.util.Arrays;

@UtilityClass
public class PersonApp {
    public void companyInfo(@NonNull Employee[] employees) {
        Arrays.stream(employees).forEach(Person::display);
    }

    public double costOfCompany(@NonNull Employee[] employees) {

        return Arrays.stream(employees)
                .mapToDouble(Employee::calculateSalary)
                .sum();
    }

    public double companyIncome(@NonNull Employee[] employees) {

        return Arrays.stream(employees)
                .filter((o1) -> o1.getClass().equals(SaleManager.class))
                .map(Employee -> (SaleManager) Employee)
                .mapToDouble(SaleManager::getTotalSales)
                .sum();


    }

    public boolean findEmployee(@NonNull Employee[] employees, @NonNull Employee employee) {
//        return Arrays.stream(employees)
//                .anyMatch(employee1 -> employee1.equals(employee));
        return Arrays.asList(employees).contains(employee);
    }
}
