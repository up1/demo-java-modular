package demo.hellomodule;

public class Main{
  public static void main(String... args){
    demo.module.calculator.Calculator cal
    = new demo.module.calculator.Calculator();
    System.out.println("Hello module 01 : " + cal.add(1, 2));
  }
}
