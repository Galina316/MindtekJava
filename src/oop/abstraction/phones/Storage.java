package oop.abstraction.phones;

public interface Storage extends CloudStorage {
    int PHONEMEMORY = 256;

    String upload ();
    static String share(){
        return "Memory is being shared...";
    }

    default String delete(){
        return "Memory is deleting...";
    }

}
