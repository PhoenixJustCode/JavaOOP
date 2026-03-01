package lab2.problem1.person;

import java.util.Objects;

public class Employee extends Person {
    private String employeeId;

    public Employee(String name, int age, String employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    public String getEmployeeId() { return employeeId; }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(employeeId, employee.employeeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), employeeId);
    }

    @Override
    public String toString() {
        return String.format("Employee[name=%s, age=%d, id=%s]", getName(), getAge(), employeeId);
    }
}
