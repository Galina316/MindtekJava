package oop.inheritance.methods;

public class Child extends Parent{
    /*
    Inherited Methods:
    1.Final method is inherited
    2. Regular method

    Methods can be overridden:
    1.Regular method
     */
    public static String staticMethod(){
        return " Static method of Parent class";
    }
  @Override
  public String regularMethod(){
      return "Regular method of Child Class";
  }
    private String privateMethod(){
        return "Private Methods of parent Class";
    }
}
