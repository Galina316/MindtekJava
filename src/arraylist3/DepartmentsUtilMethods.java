package arraylist3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DepartmentsUtilMethods {
    /**
     * Method returns list of departments names that located in same location
     *
     * Ex:
     * .getDepartmentsFromLocation(departments,1700);->return ["Administration",.....]
     */
    public static List<String> getDepartmentsFromLocation(List<Department>departments,int locationId){
        List<String> names = new ArrayList<>();
        for(Department d: departments){
            if(d.getLocationId()==locationId){
                names.add(d.getName());
            }
        }
        return names;
    }
    /**
     * Method returns department object of passed departmentId.
     *
     * Ex:
     * .getDepartmentById(departments,100); - > return department [100,"Finance",1700]
     */

    public static Department getDepartmentById(List<Department>departments,int departmentId){
        for(Department d: departments){
            if(d.getDepartmentId()==departmentId){
                return d;
            }
        }
        return null;


    }


}

