public class Employee {
    String fio = " ";
    String position = " ";
    String email = " ";
    String pnumber = "";
    int salary = 0;
    int age = 0;

    public Employee (String empFio, String empPos, String empMail, String empPnumber, int empSal, int empAge) {
        age = empAge;
        fio = empFio;
        position = empPos;
        email = empMail;
        pnumber = empPnumber;
        salary = empSal;
    }

    public void info() {
        System.out.println();
        System.out.println("Информация о сотруднике:");
        System.out.println("ФИО: " + fio);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Номер телефона: " + pnumber);
        System.out.println("Зарплата: " + salary + " Руб");
        System.out.println("Возраст: " + age);
        System.out.println();
    }
}
