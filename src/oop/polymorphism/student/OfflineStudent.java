package oop.polymorphism.student;

public class OfflineStudent implements Student{
    @Override
    public String study() {
        return "Offline students is studying from class";
    }
}
