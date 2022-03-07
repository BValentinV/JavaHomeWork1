package Lesson5;

public class Person {

    String name;
    String position;
    String email;
    String phone_number;
    int salary;
    int age;

        public Person(String name, String position, String email, String phone_number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone_number = phone_number;
        this.salary = salary;
        this.age = age;
    }

        @Override
    public String toString(){
        return String.format("Имя: %s \tДолжность: %s \nEmail: %s \t Номер телефона: %s \n Зарплата: %d \t Возраст: %d \n",
                name, position, email, phone_number, salary, age);}

        public void print(){
        System.out.println(this);
    }


    public static void main(String[] args)  {

        Person[] persArray = new Person[5];
        persArray[0] = new Person("Иван Иванов", "Директор", "II@gmail.com", "+74444444444", 350000, 60);
        persArray[1] = new Person("Петр Петров", "Директор по развитию", "PP@gmail.com", "+72222222222", 250000, 35);
        persArray[2] = new Person("Федр Федоров", "Күзет", "FF@gmail.com", "+73333333333", 80000, 59);
        persArray[3] = new Person("Мария Мариева", "Основной работник", "MM@gmail.com", "+75555555555", 200000, 30);
        persArray[4] = new Person("Анастасия Анастасиева", "Дополнительный работник", "AA@gmail.com", "+77777777777", 150000, 45);

                for (int i=0; i < persArray.length; i++)
            if (persArray[i].age > 40) persArray[i].print();

    }
}