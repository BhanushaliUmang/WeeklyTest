import java.io.*;
import java.util.*;

class Hatchback{
    HashMap<String,Integer> serviceCar1;

    Hatchback(){
        this.serviceCar1 = new HashMap<>();
        serviceCar1.put("BS01",2000);
        serviceCar1.put("EF01",5000);
        serviceCar1.put("CF01",2000);
        serviceCar1.put("BF01",1000);
        serviceCar1.put("GF01",3000);
    }
    void generatebill(String s1,String s2){
        if(serviceCar1.get(s1)+serviceCar1.get(s2)<=10000){
            System.out.println("Total bill"+"="+ (serviceCar1.get(s1)+serviceCar1.get(s2)));
        }
        else{
            System.out.println("Complimentary cleaning and your total bill = " +  (serviceCar1.get(s1)+serviceCar1.get(s2)));
        }
    }
}
class SUV{
    HashMap<String,Integer> serviceCar2;

    SUV(){
        this.serviceCar2 = new HashMap<>();
        serviceCar2.put("BS01",5000);
        serviceCar2.put("EF01",10000);
        serviceCar2.put("CF01",6000);
        serviceCar2.put("BF01",2500);
        serviceCar2.put("GF01",8000);
    }
    void generatebill(String s1,String s2){
        if(serviceCar2.get(s1)+serviceCar2.get(s2)<=10000){
            System.out.println("Total bill"+"="+ (serviceCar2.get(s1)+serviceCar2.get(s2)));
        }
        else{
            System.out.println("Complimentary cleaning and your total bill = " +  (serviceCar2.get(s1)+serviceCar2.get(s2)));
        }
    }
}
class Sedan{
    HashMap<String,Integer> serviceCar3;

    Sedan(){
        this.serviceCar3 = new HashMap<>();
        serviceCar3.put("BS01",4000);
        serviceCar3.put("EF01",8000);
        serviceCar3.put("CF01",4000);
        serviceCar3.put("BF01",1500);
        serviceCar3.put("GF01",6000);
    }
    void generatebill(String s1,String s2){
        if(serviceCar3.get(s1)+serviceCar3.get(s2)<=10000){
            System.out.println("Total bill"+"="+ (serviceCar3.get(s1)+serviceCar3.get(s2)));
        }
        else{
            System.out.println("Complimentary cleaning and your total bill = " +  (serviceCar3.get(s1)+serviceCar3.get(s2)));
        }
    }
}
public class App{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String car = sc.nextLine();
    String code1 = sc.nextLine();
    String code2 = sc.nextLine();

    if(car.equals("Hatchback")){
        Hatchback h = new Hatchback();
        h.generatebill(code1,code2);
    }
    else if(car.equals("SUV")){
        SUV s1 = new SUV();
        s1.generatebill(code1,code2);
    }
    else if(car.equals("Sedan")){
        Sedan s2 = new Sedan();
        s2.generatebill(code1,code2);
    }
}
}