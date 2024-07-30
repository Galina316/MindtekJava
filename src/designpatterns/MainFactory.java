package designpatterns;

public class MainFactory {
    public static void main(String[] args) {
        PlanFactory pfactory = new PlanFactory();
        Plan dp = pfactory.createPlan("Domestic");
        dp.getRate();
        dp.calculateBill(10);

        Plan cp = pfactory.createPlan("Commercial");
        cp.getRate();
        cp.calculateBill(10);

        Plan ip = pfactory.createPlan("Institutional");
        ip.getRate();
        ip.calculateBill(10);

        DigitalPlanfactory digPl = new DigitalPlanfactory();

        Plan diP = digPl.createPlan();
    }
}
