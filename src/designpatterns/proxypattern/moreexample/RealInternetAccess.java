package designpatterns.proxypattern.moreexample;

public class RealInternetAccess implements OfficeInternetAccess{
    private String empName;

    public RealInternetAccess(String empName) {
        this.empName = empName;
    }

    @Override
    public void grantInternetAccess() {
        System.out.println("Internet access granted for employee: "+empName);
    }
}
