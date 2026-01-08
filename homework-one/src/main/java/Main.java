public class Main {
    public static void main(String[] args) {
        SaleManager saleManager = new SaleManager("Алексей", 16, false, "Инкомпаратион", "крутой", 100, 50, 4);
        SaleManager saleManager1 = new SaleManager("Алексей", 16, false, "Инкомпаратион", "крутой", 100, 30, 4);
        Employee[] employees = new Employee[2];
        employees[0] = saleManager;
        employees[1] = saleManager1;
        System.out.println(PersonApp.companyIncome(employees));
    }









}
