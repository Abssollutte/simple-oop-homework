import lombok.NonNull;
import lombok.experimental.UtilityClass;

import java.util.Arrays;

@UtilityClass
public class PersonApp {
    public static void companyInfo(@NonNull Employee[] employees) {
        Arrays.stream(employees).forEach(System.out::println);
    }

    public static double costOfCompany(@NonNull Employee[] employees) {

        return Arrays.stream(employees)
                .mapToDouble(Employee::getBaseSalary)
                .sum();
    }

    public static double companyIncome(@NonNull Employee[] employees) {

        return Arrays.stream(employees)
                .filter((o1) -> o1 instanceof SaleManager)
                .map(Employee -> (SaleManager) Employee)
                .mapToDouble(SaleManager::getTotalSales)
                .sum();


    }

    public static boolean findEmployee(@NonNull Employee[] employees, @NonNull Employee employee) {
        return Arrays.stream(employees)
                .anyMatch(employee1 -> employee1.equals(employee));
    }
}
