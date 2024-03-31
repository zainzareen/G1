import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Student{
    void display(){
        System.out.println("Enter your name");
        Scanner s=new Scanner(System.in);
        String n=s.nextLine();
        System.out.println("Name is "+n);
    }
    void age(LocalDate bd){
        LocalDate today=LocalDate.now();       
        int year=Period.between(bd,today).getYears();
        System.out.println("Today's date is "+today);
        System.out.println("Your birthdate is "+bd);
        System.out.println(year+" years completed");
    }
    public static void main(String args[]){
        Student s1=new Student();
        s1.display();
        System.out.println();
        System.out.println("Enter your birthdate");
        Scanner s=new Scanner(System.in);
        String date=s.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
        LocalDate bd = LocalDate.parse(date, formatter);           
        s1.age(bd);
    }
}