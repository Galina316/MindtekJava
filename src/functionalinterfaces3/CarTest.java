package functionalinterfaces3;

import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.jar.Attributes;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota",2020,"Sedan","White");
        Car car2 = new Car("Honda",2024,"SUV","Red");
        Car car3 = new Car("Mercedes",2022,"Sedan","Black");
        Car car4 = new Car("BMW",2018,"SUV","Silver");
        Car car5 = new Car("Chevrolet",2015,"SUV","Blue");

        List<Car> cars = List.of(car1,car2,car3,car4,car5);

        /*
        get cars models that is 2020 and newer.
         */

      //  for(Car c: cars){
           // if(c.getYear()>=2020){
                //System.out.println(c.getModel());
           // }
        //}

        getDataFromCars(cars,x-> x.getYear()>=2020, Car::getModel);
        /*
        get colors of SUV cars
         */
        //for(Car c: cars){
           // if(c.getType().equals("SUV")){
               // System.out.println(c.getColor());
            //}
       // }


        getDataFromCars(cars,car -> car.getType().equals("SUV"), Car::getColor);

        //x->x.getModel();   Car::getModel

        // get years of sedan cars



        getDataFromCars(cars,car -> car.getType().equals("Sedan"), Car::getYear);

        //Print first 3 letters of Model in uppercase of SUV cars that are having evn number of year
        System.out.println("================");


        getDataFromCars(cars,car->car.getType().equalsIgnoreCase("SUV")&& car.getYear()%2==0,car->car.getModel().substring(0,3).toUpperCase());

        //Count SUV cars
        System.out.println("==========");

        System.out.println("Numbers of SUV cars : "+getCountOfCars(cars,x->x.getType().equals("SUV")));
        System.out.println("Numbers of Sedan cars: "+getCountOfCars(cars,x->x.getType().equals("Sedan")));
        System.out.println("Numbers of black cars : "+getCountOfCars(cars,x->x.getColor().equals("Black")));





    }
    public static int getCountOfCars(List<Car> cars, CarCondition condition){
        int count=0;
        for(Car c: cars){
            if(condition.apply(c)){
                count++;
            }
        }
        return count;
    }




    public static void getDataFromCars(List<Car> cars, CarCondition condition, AttributesFunction<Object> function){
        for(Car c: cars){
            if(condition.apply(c)){
                System.out.println(function.get(c));
            }
        }

    }
}
