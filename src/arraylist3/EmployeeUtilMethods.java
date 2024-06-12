package arraylist3;

import java.util.ArrayList;
import java.util.List;

public class EmployeeUtilMethods {
    /**
     * Method will return list of employees id that has salary more than average salary
     * Ex:
     * <p>
     * .getIdMoreThanAvgSalary(employee); return [President ect,......]
     */
    public static List<String> getIdMoreThanAvgSalary(List<Employee>employees){

        int sum = 0;
        for(Employee e : employees) {
            sum+=e.getJob().getSalary();
        }
        int averageSalary = sum/ employees.size();
        List<String> id = new ArrayList<>();
        List<Integer>empId = new ArrayList<>();
        for(Employee e: employees){
            if(e.getJob().getSalary()>averageSalary){
                String Integer = null;

                //id.add(e.getEmployeeId());
            }
        }
        return id;

    }
}
