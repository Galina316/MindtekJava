package objects;

public class Company {
    public static void main(String[] args) {
        // constructor is for initialize instance variable of object when object is being created


    Employee employee1 = new Employee("John",101,true,'M');

    Employee employee2 = new Employee("Patel",102,true,'M');

    Employee employee3 = new Employee("kim",103,false,'M');

    Employee employee4 = new Employee("Sarah",104,false,'F');

    Employee employee5 = new Employee("Srinivasan",105,true,'M');

    Employee[]employees={employee1,employee2,employee3,employee4,employee5};

    //print names of employees whoes name contain letter 'a' or 'e' and has is even number

        for (int i =0; i< employees.length;i++){
            if((employees[i].name.contains("a")||employees[i].name.contains("e")) && employees[i].id%2==0){
                System.out.println(employees[i].name);
            }

            for(Employee e: employees){
                if((e.name.toLowerCase().contains("a")||e.name.toLowerCase().contains("e"))&& e.id%2==0){
                    System.out.println(e.name);
                }
            }
            // print last 3 chars of names of male empl who work remotly


        }
        for(Employee e: employees){
            if(e.isRemote && e.gender=='M' && e.name.length()>2 ){
                System.out.println(e.name.substring(0,e.name.length()-3));
            }
        }


    }
}
