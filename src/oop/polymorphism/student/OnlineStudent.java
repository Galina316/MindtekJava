package oop.polymorphism.student;

public class OnlineStudent implements Student{
    @Override
    public String study() {
        return "Online students is studying from home";
    }
    public String doHomework(){
        return "Online student is doing homework";
    }
}
