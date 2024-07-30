package designpatterns.singlepattern;

public class DBConnection {
    private static DBConnection obj;

    private DBConnection(){};
    public static DBConnection getConnection(){
        if(obj==null)return new DBConnection();
        return obj;
    }
    public void create(){
        System.out.println("Db create operation is running");
    }
    public void delete(){
        System.out.println("Db delete operation is running");
    }
    public void update(){
        System.out.println("Db update operations");
    }
}
