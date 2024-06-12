package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PracticeList {
    public static void main(String[] args) {
        List<String> companies = new ArrayList<>(List.of("Google","Apple","Meta","Mindtek","Tesla","Netflix","Amazon"));
        System.out.println(companies);
        //Without looping find the order number of Amazon in List

        System.out.println("Order number of Amazon "+companies.indexOf("Amazon")+1);
        // replace companies that Starts with letter N with Microsoft
        for(String c: companies){
            if(c.startsWith("N")){
                companies.set(companies.indexOf(c),"Microsoft");
            }
        }
        System.out.println(companies);

        // remove that companies that have 5 char
        for(int i = 0; i<companies.size();i++){
            if(companies.get(i).length()==5){
                companies.remove(companies.get(i));
                i--;

            }
        }
        System.out.println(companies);

        //concatenate get first and last char of each company and replace that company name

        for(int i=0;i<companies.size();i++){
          String chars = ""+companies.get(i).charAt(0)+companies.get(i).charAt(companies.get(i).length()-1);
          companies.set(i,chars);

        }
        System.out.println(companies);

        //for(int i = 0;i<companies.size();i++){
            //if(companies.get(i).startsWith("N")){
               // companies.set(i,"Microsoft");

            }
        }



