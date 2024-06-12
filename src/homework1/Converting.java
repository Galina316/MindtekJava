package homework1;

public class Converting {
    public static void main(String[] args) {
        final double DOLLAR_TO_EURO_RATE=0.9;
        final double EURO_TO_DOLLAR_RATE=1.08;
        CurrencyConverter dollarToEuro = amount -> (int) (amount* DOLLAR_TO_EURO_RATE);
        CurrencyConverter euroToDollar = amount -> (int) (amount*EURO_TO_DOLLAR_RATE);
        System.out.println("Dollars to Euros: "+dollarToEuro.convert(10));
        System.out.println("Euros to Dollars: "+euroToDollar.convert(25));

        }
    }

