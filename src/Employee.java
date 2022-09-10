import java.util.Objects;

public class Employee {
    private String fullName;                // поля
    private int department;                 // поля
    private int salaryOfPersonal;           // поля
    static int id;                          // поля

    public Employee(String fullName,int department, int salaryOfPersonal) {  //Констурктор
        this.fullName = fullName;                               //Констурктор
        this.department = department;                           //Констурктор
        this.salaryOfPersonal = salaryOfPersonal;               //Констурктор
        id++;                                          // Счетчик

    }

    public String getFullName() {
        return fullName;
    }  //Геттер

    public int getDepartment() {                        //Геттер
        return department;
    }

    public int getSalaryOfPersonal() {                  //Геттер
        return salaryOfPersonal;
    }

    public void setFullName(String fullName) {          //Сеттер
        this.fullName = fullName;
    }

    public void setDepartment(int department) {            //Сеттер
        this.department = department;
    }

    public void setSalaryOfPersonal(int salaryOfPersonal) {   //Сеттер
        this.salaryOfPersonal = salaryOfPersonal;
    }



    @Override
    public String toString() {
        return  "fullName='" + fullName + '\'' +
                ", department=" + department +
                ", salaryOfPersonal=" + salaryOfPersonal +
                '}';
    }

}
