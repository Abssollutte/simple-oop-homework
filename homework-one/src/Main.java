import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Manager manager1 = new Manager();
        Manager manager2 = new Manager();
        WageEmployee wageEmployee = new WageEmployee();
        WageEmployee wageEmployee1 = new WageEmployee();
        WageEmployee wageEmployee2 = new WageEmployee();
        SaleManager saleManager = new SaleManager();
        SaleManager saleManager1 = new SaleManager();
        SaleManager saleManager2 = new SaleManager();
        SaleManager saleManager3 = new SaleManager();
        Employee[] company = new Employee[10];
        company[0] = manager;
        company[1] = manager1;
        company[2] = manager2;
        company[3] = wageEmployee;
        company[4] = wageEmployee1;
        company[5] = wageEmployee2;
        company[6] = saleManager;
        company[7] = saleManager1;
        company[8] = saleManager2;
        company[9] = saleManager3;
        PersonApp.companyInfo(company);
        System.out.println(PersonApp.companyIncome(company));
        System.out.println(PersonApp.costOfEmployess(company));
        System.out.println(PersonApp.findEmploye(company, saleManager));
    }
    static class Person {
        String name;
        int age;
        boolean married;
        void display() {
            System.out.println("Имя: "+ name);
            System.out.println("Возраст: " + age);
            System.out.println("Женат ли: " + married);
        }
    }

    static class Employee extends Person {
        String company;
        String position;
        double baseSalary;

        @Override
        void display() {
            super.display();
            System.out.println("Компания: " + company);
            System.out.println("Должность: " + position);
            System.out.println("Зарплата: " + baseSalary);
        }
    }

    static class Manager extends Employee {
        int grade;
        @Override
        void display() {
            super.display();
            System.out.println("Уровень: " + grade);
        }

        double calculateSalary() {
            return baseSalary * grade;
        }
    }

    static class SaleManager extends Employee {
        double totalSales;
        double bonus;

        @Override
        void display() {
            super.display();
            System.out.println("Объем продаж: " + totalSales);
            System.out.println("Бонус: " + bonus);
        }
        double calculateSalary() {
            return baseSalary + bonus;
        }

    }

    static class WageEmployee extends Employee {
        double hours;
        double wage;

        @Override
        void display() {
            super.display();
            System.out.println("Часы: " + hours);
            System.out.println("Ставка: " + wage);
        }
        double calculateSalary() {
            return baseSalary + hours * wage;
        }

    }

    static class PersonApp {
        static void companyInfo(Employee[] employes) {
            if (employes != null) {
                for (Employee employe : employes) {
                    employe.display();
                }
            }

        }
        static double costOfEmployess(Employee[] employes) {
            if (employes != null) {
                double result = 0;
                for (Employee employe : employes) {
                    result += employe.baseSalary;
                }
                return result;
            }

            return 0;
        }
        static double companyIncome(Employee[] employes) {
            if (employes != null) {
                double result = 0;
                for (Employee employe : employes) {
                    if (employe instanceof SaleManager) {
                        SaleManager manager = (SaleManager) employe;
                        result += manager.totalSales;
                    }
                }
                return result;
            }

            return 0;
        }
        static boolean findEmploye(Employee[] employes, Employee employe) {
            if (employes != null) {
                for (Employee employe1 : employes) {
                    if (employe1.equals(employe)) {
                        return true;
                    }
                }
                return false;
            }


            return false;
        }
    }

}
