package oop.abstraction.phones;

public class IPhone extends Phone {
    @Override
    public String takePhoto() {
        return "IPhone is taking photo";
    }

    @Override
    public String call() {
        return "IPhone is calling";
    }

    @Override
    public String text() {
        return "Iphone is texting";
    }

    @Override
    public String upload() {
        return "IPhone is uploading to memory";
    }
}
