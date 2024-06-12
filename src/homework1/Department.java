package homework1;

public class Department {
  private String name;
  private int departmentId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", departmentId=" + departmentId +
                '}';
    }

    public Department(String name, int departmentId) {
        this.name = name;
        this.departmentId = departmentId;
    }
}
