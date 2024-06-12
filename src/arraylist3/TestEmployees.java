package arraylist3;

import java.util.ArrayList;
import java.util.List;

public class TestEmployees {
    public static void main(String[] args) {
        System.out.println(EmployeeData.getEmployees());


        System.out.println(EmployeeData.getEmployees().get(0).getDepartment().getName());
        System.out.println(EmployeeData.getEmployees().get(10).getJob().getSalary());
        System.out.println(EmployeeData.getEmployees().get(18).getDepartment().getLocationId());

        // print Employees first Name who works in it department

       for (Employee e: EmployeeData.getEmployees()){
           if(e.getDepartment().getName().equalsIgnoreCase("IT")){
               System.out.println(e.getFirstName());

               // get total salary who works in finance department


           }
       } int sum =0;
       for(Employee e : EmployeeData.getEmployees()){
           if(e.getDepartment().getName().equalsIgnoreCase("Finance")){
               sum+=e.getJob().getSalary();

           }
       }System.out.println(sum);
       /*
       Print employee ids those that has salary more than average salary
       print employee first name whose employee id and departmentId are odd numbers
       Print department name that has most employees.
        */


        String name = "";
        for(Employee e: EmployeeData.getEmployees()){
            if(e.getEmployeeId()%2!=0 && e.getDepartment().getDepartmentId()%2!=0){
                name = e.getFirstName();
            }
        }
        System.out.println(name);
        System.out.println("===========");

        //print employee first name whose employee id and departmentId are odd numbers
        for(Employee e: EmployeeData.getEmployees()){
            if(e.getEmployeeId()%2 !=0 && e.getDepartment().getDepartmentId()%2!=0){

            }System.out.print(e.getFirstName()+", ");
        }
        System.out.println("=========");

        // Print employee ids those that has salary more than average salary
        int summ = 0;
        for(Employee e: EmployeeData.getEmployees()){
            summ+=e.getJob().getSalary();
        }
        for(Employee e1:EmployeeData.getEmployees()){
            int avgSalary = sum/EmployeeData.getEmployees().size();
            if(e1.getJob().getSalary()>avgSalary){


            }System.out.print(e1.getEmployeeId()+", ");
        }
        System.out.println("============");

        // Print department name that has most employees.
        String depName="";
        int max = 0;
        for(Department d: DepartmentData.getDepartments()){
            int count = 0;
            for(Employee e :EmployeeData.getEmployees()){
                if(e.getDepartment().getName().equals(d.getName())){
                    count++;
                }
            }
            if(count>max){
                max=count;
                depName=d.getName();
            }
        }
        System.out.println(depName);


        }


    }





