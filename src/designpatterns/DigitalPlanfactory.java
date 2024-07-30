package designpatterns;

public class DigitalPlanfactory implements IPlanFactory {
    @Override
    public Plan createPlan() {
        return new DigitalPlan();
    }
}
