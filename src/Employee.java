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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && salaryOfPersonal == employee.salaryOfPersonal && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, department, salaryOfPersonal);
    }

    @Override
    public String toString() {
        return  "fullName='" + fullName + '\'' +
                ", department=" + department +
                ", salaryOfPersonal=" + salaryOfPersonal +
                '}';
    }
}
