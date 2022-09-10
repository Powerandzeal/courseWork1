public class Main {

    public static void main(String[] args) {
        Employee [] person = new Employee[10];
        int salarySumInTheMonth = 0;
        person [0] = new Employee("Ivavanov Ivan Ivanovich",2,56000);
        person [1] = new Employee("Alexandrow Oleg Evgenievich",1,43000);
        person [2] = new Employee("Panin Vacheslav Genadevich",3,32600);
        person [3] = new Employee("Vasileva Ksenia Andreevna",4,19000);
        person [4] = new Employee("Kotov Iliya Petrovich",2,71000);
        person [5] = new Employee("Afanasef Iliya Vladimirovich",2,17000);
        person [6] = new Employee("Petrov Iliya Ivanovich",5,24000);
        person [7] = new Employee("Lebedev Atrem Eygenevich",3,58000);
        person [8] = new Employee("Ivanova Daria Petrovich",1,13000);
        person [9] = new Employee("Shurow Vasiliy Genadevich",5,23000);

        for (int i = 0; i < person.length; i++) { //Вывод списка работников
            System.out.println(person[i]);
        }
        System.out.println();
        for (int e = 0; e < person.length; e++) { // Вывод суммы зарплат для всех сотррудников в месяц
          salarySumInTheMonth = salarySumInTheMonth+ person[e].getSalaryOfPersonal() ;

        }
        System.out.println();
        System.out.println("Salary on the Person in the month "+salarySumInTheMonth);
        //3. Найти сотрудника с минимальной зарплатой.
        //4. Найти сотрудника с максимальной зарплатой.
        int maxNum = 0;
        int minNum = 1000000;
        for (int b = 0;b<person.length;b++) {
            if (person[b].getSalaryOfPersonal() > maxNum) {
                maxNum = person[b].getSalaryOfPersonal();
            }
            if (person[b].getSalaryOfPersonal() < minNum) {
                minNum = person[b].getSalaryOfPersonal();
            }


        }
        System.out.println("Max Salary  "+maxNum);
        System.out.println("Min Salary  "+minNum);
        System.out.println();
        //5. Подсчитать среднее значение зарплат
        int averageSalary = salarySumInTheMonth/person.length;
        System.out.println("Average Salary in the personal "+averageSalary);
        System.out.println();

        //6. Получить Ф. И. О. всех сотрудников (вывести в консоль).
        System.out.print("List of the person");
        for (int f = 0; f < person.length; f++) {
            System.out.println(person[f].getFullName());
        }

    }

    /*public static void getArrageSalary () {
        System.out.println(person[0]);

    }*/


}
