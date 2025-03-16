package Encapsulation;

public class Main {
    private static String name;
    private  static int roll ;
    private static void prinInfo(){
        System.out.println("Name="+name);
        System.out.println("Roll ="+ roll);
    }
    public static void main(String[]args){
//        Main m = new Main();//
        name="Satya";
        roll=10;
        Main.prinInfo();
        new Hello().setHello(45);
        System.out.println(new Hello().getHello());
    }
    private static  class Hello{
        Hello(){
            System.out.println("Hello world ");
        }
         void setHello(int roll){
            Main.roll=roll;
        }
        int getHello(){
            return Main.roll;
        }
    }
    }