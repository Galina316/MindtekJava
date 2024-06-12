package stringbuilder2;

public class EqualsMethod2 {
    public static void main(String[] args) {
        StringBuilder stb1 = new StringBuilder("Apple");
        StringBuilder stb2 = new StringBuilder("Apple");
        StringBuilder stb3 = new StringBuilder("Apple");
        stb1=stb2;
        System.out.println(stb1.equals(stb2));
        stb2 = stb3;
        System.out.println(stb1.equals(stb2));
        System.gc();
    }
}
