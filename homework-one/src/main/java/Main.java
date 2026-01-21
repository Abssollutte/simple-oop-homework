

public class Main {
        public static void main(String[] args) {
            Employee[] employees = new Employee[10];

        employees[0] = new Manager("Bacunuii", 18, true, "Pakosti INC", "Nosmyna", 200, 3);
        employees[1] = new WageEmployee("Employee1", 25, false, "Pakosti INC", "Developer", 400, 40, 20);
        employees[2] = new SaleManager("Employee2", 30, true, "Pakosti INC", "Sales", 500, 10000, 5);
        employees[3] = new Manager("Manager2", 28, false, "Pakosti INC", "Nosmyna", 300, 2);
        employees[4] = new WageEmployee("Employee3", 22, true, "Pakosti INC", "Tester", 350, 35, 15);
        employees[5] = new SaleManager("Employee4", 35, true, "Pakosti INC", "Sales", 600, 20000, 7);
        employees[6] = new Manager("Manager3", 40, true, "Pakosti INC", "Director", 500, 5);
        employees[7] = new WageEmployee("Employee5", 27, false, "Pakosti INC", "Analyst", 450, 38, 18);
        employees[8] = new SaleManager("Employee6", 32, false, "Pakosti INC", "Sales", 550, 15000, 6);
        employees[9] = new WageEmployee("Employee7", 29, true, "Pakosti INC", "Designer", 420, 32, 17);

        PersonApp.companyInfo(employees);
        System.out.println(PersonApp.companyIncome(employees));
        System.out.println(PersonApp.costOfCompany(employees));
        System.out.println(PersonApp.findEmployee(employees, employees[1]));
    }









}
