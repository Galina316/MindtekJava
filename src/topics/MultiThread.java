package topics;

public class MultiThread implements Runnable{
    public void run(){
        for(int i = 1;i<6;i++){
            System.out.println(i);
        }
    }
}
