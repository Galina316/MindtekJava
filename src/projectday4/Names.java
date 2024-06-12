package projectday4;

public class Names {
    public static void main(String[] args) {
        String[] employees ={"Steven King", "Neena Kochar", "Alexander Hunold","David Austin"};
        for(int i = 0; i<employees.length; i++){
            int index = employees[i].indexOf(" ");
            String name = employees[i].substring(0,index);
            System.out.println(name);
        }
    }
}
