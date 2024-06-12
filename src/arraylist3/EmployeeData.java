package arraylist3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class EmployeeData {
    private static List<Employee> employees = new ArrayList<>();

    static {
        try {
            FileReader file = new FileReader("C:\\Users\\galin\\IdeaProjects\\MindtekJavaProject\\src\\arraylist3\\Employees.csv");
            BufferedReader br = new BufferedReader(file);
            String line = br.readLine();
            while (line != null) {
                String[] words = line.split(",");
                //words = [Steven, King ,100,....]
                Department department = DepartmentsUtilMethods.getDepartmentById(DepartmentData.getDepartments(), Integer.parseInt(words[3]));
                Job job = JobsUtilityMethods.getJobById(Data.getJobs(), words[4]);
                Employee employee = new Employee(words[0], words[1], Integer.parseInt(words[2]), department, job);
                employees.add(employee);
                line = br.readLine();
            }
        }catch (Exception e){}
    }
    public static List<Employee> getEmployees(){
        return employees;
    }
}
