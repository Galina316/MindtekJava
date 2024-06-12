package arraylist2;

import java.util.ArrayList;
import java.util.List;

public class UtilityMethods {
    /**
     * This Method will take program id as parameter and return students who attend that program
     *
     * Example:
     * .getStudents(students,101);-> return list of students
     */
    public static List<Student> getStudents(List<Student>students,int programId){
        List<Student> studentList = new ArrayList<>();
        for(Student s : students){
            if(s.getProgram().getId()==programId){
                studentList.add(s);
            }
        }
        return studentList;
    }
    /**
     * Method returns List of classes for a provided program
     *
     * Ex:
     * .getClasses("Java Development"); - > return list of classes (Java,Java Stream ......)
     */

    public static List<String> getClasses(List<Program>programs,String programName ) {
        List<Class> classList = new ArrayList<>();
        for (Program p : programs) {
            if (p.getName().equalsIgnoreCase(programName)) {
                return p.getClasses();
            }
        }
        return null;


    }
    /**
     * Methods will take list of student and location of students and return list of Ids of students
     * who studies from that location
     *
     * ex:
     * getStudentIds(students,"chicago IL"); and return id of that student
     */
    public static List<Integer> getStudentIds(List<Student> students,String location){
        List<Integer>ids = new ArrayList<>();
        for(Student s : students){
            if(s.getLocation().equalsIgnoreCase(location)){
                ids.add(s.getId());
            }
        }
        return ids;
    }
}
