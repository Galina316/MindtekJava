package designpatterns.singlepattern;

public class test123 {
    public void testConnection (){
        DBConnection dbObj = DBConnection.getConnection();
        System.out.println(dbObj);
    }
}
