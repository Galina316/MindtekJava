package functionalinterfaces3;

import java.util.function.Function;

public class BuildInJavaFunInterfaces {
    public static void main(String[] args) {


    Function<Integer,Boolean>valid= x-> x>=18;
        System.out.println(valid.apply(20));


        Function<String,String> getInitials = x-> {
            char firstI = x.charAt(0);
            char lastI = x.charAt(x.indexOf(" ")+1);
            return""+firstI+lastI;
        };
        System.out.println(getInitials.apply("John Doe"));
        System.out.println(getInitials.apply("Donkey Kong"));

        Function<Car,Boolean> isBrandNew = x-> x.getYear()==2024;

        Car car = new Car("Tayota",2024,"Suv","Black");
        System.out.println(isBrandNew.apply(car));

}
}
