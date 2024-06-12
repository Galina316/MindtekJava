package arraylist3;

public class TestDepartments {
    public static void main(String[] args) {
        System.out.println(DepartmentData.getDepartments());
        System.out.println(DepartmentsUtilMethods.getDepartmentsFromLocation(DepartmentData.getDepartments(),1700));
        System.out.println("============");
        System.out.println(DepartmentsUtilMethods.getDepartmentById(DepartmentData.getDepartments(),100));
        System.out.println("=============");
    }
}
