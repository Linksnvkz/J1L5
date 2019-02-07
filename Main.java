public class Main {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Агаев Эльдар Ризванович", "Junior Java Developer",
                "dgulia_92@mail.ru", "88005553535", 40000, 25);
        Employee emp2 = new Employee("Иванов Иван Иванович", "Senior Java Developer",
                "ivanovI@mail.ru", "88002500890", 100000, 32);

        emp1.info();
        emp2.info();

        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Иванов Иван Иванович", "Инженер",
                "ivivan@mailbox.com", "892312312", 30000, 30);
        empArray[1] = new Employee("Агаев Эльдар Ризванович", "IT-Специалист",
                "dgulia_92@mail.ru", "88005553535", 30000, 25);
        empArray[2] = new Employee("Петров Петр Петрович", "Senior Java Developer",
                "ivanovI@mail.ru", "88002500890", 50000, 32);
        empArray[3] = new Employee("Сергеев Сергей Сергеевич", "Директор",
                "Serj@rambler.ru", "89133134556", 70000, 41);
        empArray[4] = new Employee("Петрова Надежда Михайловна", "Главный Бухгалтер",
                "petrBuh@gmail.com", "89039958386", 50000, 53);

        for (int i = 0; i<empArray.length; i++) {
            if (empArray[i].age > 40) {
                empArray[i].info();
            }
        }
    }
}
