package StringBuilder;

public class StbExample {
    public static void main(String[] args) {


        long startTimestb = System.currentTimeMillis();
        //reference       =        object
        StringBuilder stb = new StringBuilder("Java");
        stb.append(" is easy");
        System.out.println(stb);

        long endsTimeStb = System.currentTimeMillis();
        System.out.println("Time "+(endsTimeStb-startTimestb));


        long startTimestr = System.currentTimeMillis();

        String str = "Java";
        str = str+" is easy";
        System.out.println(str);
        long endsTimeStr = System.currentTimeMillis();
        System.out.println("Time "+(endsTimeStr-startTimestr));
    }
}
