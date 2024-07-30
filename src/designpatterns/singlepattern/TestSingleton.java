package designpatterns.singlepattern;

public class TestSingleton {
    public static void main(String[] args) {

        Logging obj1 = Logging.getInstance();
        Logging obj2 = Logging.getInstance();
        System.out.println(obj1.equals(obj2));

        DBConnection dbObj = DBConnection.getConnection();
        System.out.println(dbObj);

        test123 test1 = new test123();
        test1.testConnection();
    }
}

//used
