package arrays2;

public class NameToEmail {
    public static void main(String[] args) {
        /*
        john.d@mindtek.io
         */
        String[] names ={"John Doe","Patel Harsh","Kim Yan","Brat Pitt"};
        for(int i = 0; i<names.length;i++){
           String  name = names[i].toLowerCase();
           //int indexOfSpace = name.indexOf(" ");
            String[] firstLastName=name.split(" ");//firstLastName={John,"Doe"}
            String email = firstLastName[0]+"."+ firstLastName[1].charAt(0)+"@mindtek.io";
            System.out.println(email);
        }


    }
}
