package designpatterns.proxypattern;

public class MainClient {
    public static void main(String[] args) {
        //InfoParser ip = new InfoParser();// expensive operation
      //  ip.readData();
        InfoParserProxy infoParserProxy = new InfoParserProxy();
        infoParserProxy.readData();

        System.out.println("********");


        infoParserProxy.readData();
        infoParserProxy.readData();

    }
}
