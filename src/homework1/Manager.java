package homework1;

public class Manager {
   private String name;
    private int id;
   private long salary;
    private Department department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getSalary() {
        return salary;
    }

    public void setPopulation(long salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", population=" + salary +
                ", department=" + department +
                '}';
    }

    public Manager(String name, int id, long population, Department department) {
        this.name = name;
        this.id = id;
        this.salary = population;
        this.department = department;
    }
}
