package practice1;

public class ArrayDuplicate {
    public static void main(String[] args) {
        char[]symbols ={'A','&','$','#','$'};
        boolean dupFound = false;
        for(int i = 0; i < symbols.length;i++){
            for(int j = i+1;j< symbols.length;j++){
                if(symbols[i]==symbols[j]){
                    dupFound = true;
                }

            }
        }


        if(dupFound) System.out.println("Dup found");
        else System.out.println("No dup found");
    }
}
