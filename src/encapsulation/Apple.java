package encapsulation;

public class Apple {
    public static void main(String[] args) {
        Department department1 = new Department("IT",1,"Cupertino CA");
        Department department2 = new Department("Finance",2,"Austin TX");
        Department department3 = new Department("HR",3,"Austin TX");

        Employee employee1 = new Employee("John Doe",101,department1);
        Employee employee2 = new Employee("Patel Harsh",102,department2);
        Employee employee3 = new Employee("Kim Yan",103,department2);
        Employee employee4 = new Employee("Kate Connor",104,department3);
        Employee employee5 = new Employee("Brad Pitt",105,department1);

        Employee[]employees = {employee1,employee2,employee3,employee4,employee5};

        // John Doe works in IT deaprtment
        for(Employee e: employees){
            System.out.println(e.getName()+" works in "+e.getDepartment().getName()+ " department");
        }
        System.out.println("==========");
        // print emplouyee Id who works in IT department
        for(Employee e: employees){
            if(e.getDepartment().getName().equals("IT"))
                System.out.println(e.getEmployeeId());
        }
        // count of number of employee who works in Austin TX
        int count =0;
        for(Employee e: employees) {
            if (e.getDepartment().getLocation().equals("Austin TX"))
                count++;
        }
        System.out.println("Number of people who works in Austin TX "+ count);
        // find out employees who have ID and Departmen as even number
        // find out employees who work in Cupertino and employee name has more than 5 chars
        System.out.println("=========");

        for(Employee e: employees){
            if(e.getDepartment().getDepartmentId()%2==0 && e.getEmployeeId()%2==0){
                System.out.println(e.getName());
                System.out.println("********");
            }

            }
        for(Employee e: employees){
           String firstName = e.getName().split(" ")[0];
           if(e.getDepartment().getLocation().equalsIgnoreCase("Cupertino CA") && e.getName().split(" ")[0].length()>=4){
                System.out.println(e.getName());
        }
        }


    }
}
