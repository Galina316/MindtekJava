package designpatterns.proxypattern.moreexample;

public class ProxyInternetAccess implements OfficeInternetAccess {
    private RealInternetAccess realInternetAccess;
   private String enpName;
   public ProxyInternetAccess(String empName){
       this.enpName=empName;
   }
   public int getRole(String empName){
       //look up to db and find role of employee
       if(empName.length()>5)return 7;
       else return 3;
   }

    @Override
    public void grantInternetAccess() {
       //grant access only for people with role >then 5
        if(getRole(enpName)>5){
            realInternetAccess = new RealInternetAccess(enpName);
            realInternetAccess.grantInternetAccess();
        }else System.out.println("Sorry it is not available for you");

    }
}
