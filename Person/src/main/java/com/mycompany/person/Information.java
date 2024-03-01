/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.person;

/**
 *
 * @author JARVIS
 */
import java.util.Scanner;

public class Information {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person friend1 = new Person();
        Person friend2 = new Person();
        Person friend3 = new Person();
        Person friend4 = new Person();
        Person friend5 = new Person();
        
        Scanner scanner = new Scanner(System.in);
        
        String dummy;
        
        System.out.print("Enter Name: ");
        friend1.setName(scanner.nextLine());
        System.out.print("Enter Address: ");
        friend1.setAddress(scanner.nextLine());
        System.out.print("Birth Day (01-31): ");
        friend1.setDay(scanner.nextInt());
        System.out.print("Birth Month(01-12): ");
        friend1.setMonth(scanner.nextInt());
        System.out.print("Birth Year(0-2024): ");
        friend1.setYear(scanner.nextInt());
        
        dummy = nextLine();
        
        System.out.print("Enter name: ");
        friend2.setName(scanner.nextLine());
        System.out.print("Enter address: ");
        friend2.setAddress(scanner.nextLine());
        System.out.print("Enter Day(01-31): ");
        friend2.setDay(scanner.nextInt());
        System.out.print("Enter Month(01-12): ");
        friend2.setMonth(scanner.nextInt());
        System.out.print("Enter Year(0-2024): ");
        friend2.setYear(scanner.nextInt());
        
        
        System.out.print("Enter name: ");
        friend3.setName(scanner.nextLine());
        System.out.print("Enter address: ");
        friend3.setAddress(scanner.nextLine());     
        System.out.print("Enter Day(01-31): ");
        friend3.setDay(scanner.nextInt());
        System.out.print("Enter Month(01-12): ");
        friend3.setMonth(scanner.nextInt());
        System.out.print("Enter Year(0-2024): ");
        friend3.setYear(scanner.nextInt());
        
        
        System.out.print("Enter name: ");
        friend4.setName(scanner.nextLine());
        System.out.print("Enter address: ");
        friend4.setAddress(scanner.nextLine());      
        System.out.print("Enter Day(1-31): ");
        friend4.setDay(scanner.nextInt());
        System.out.print("Enter Month(01-12): ");
        friend4.setMonth(scanner.nextInt());
        System.out.print("Enter Year(0-2024): ");
        friend4.setYear(scanner.nextInt());
        
        
        System.out.print("Enter name: ");
        friend5.setName(scanner.nextLine());
        System.out.print("Enter address: ");
        friend5.setAddress(scanner.nextLine());
        System.out.print("Enter Day(1-31): ");
        friend5.setDay(scanner.nextInt());
        System.out.print("Enter Month(01-12): ");
        friend5.setMonth(scanner.nextInt());
        System.out.print("Enter Year(0-2024): ");
        friend5.setYear(scanner.nextInt());
        
        
        
        System.out.println("Name: "+ friend1.getName());
        System.out.println("Address: "+ friend1.getAddress());
        System.out.println("Birth Day: "+ friend1.getDay());
        System.out.println("Birth Month: "+ friend1.getMonth());
        System.out.println("Birth Year: "+ friend1.getYear());
        System.out.println("Age: "+ friend1.getAge());
        
        System.out.println("Name: "+ friend2.getName());
        System.out.println("Address: "+ friend2.getAddress());
        System.out.println("Birth Day: "+ friend2.getDay());
        System.out.println("Birth Month: "+ friend2.getMonth());
        System.out.println("Birth Year: "+ friend2.getYear());
        System.out.println("Age: "+ friend2.getAge());
        
        System.out.println("Name: "+ friend3.getName());
        System.out.println("Address: "+ friend3.getAddress());
        System.out.println("Birth Day: "+ friend3.getDay());
        System.out.println("Birth Month: "+ friend3.getMonth());
        System.out.println("Birth Year: "+ friend3.getYear());
        System.out.println("Age: "+ friend3.getAge());
        
        System.out.println("Name: "+ friend4.getName());
        System.out.println("Address: "+ friend4.getAddress());
        System.out.println("Birth Day: "+ friend4.getDay());
        System.out.println("Birth Month: "+ friend4.getMonth());
        System.out.println("Birth Year: "+ friend4.getYear());
        System.out.println("Age: "+ friend4.getAge());
        
        System.out.println("Name: "+ friend5.getName());
        System.out.println("Address: "+ friend5.getAddress());
        System.out.println("Birth Day: "+ friend5.getDay());
        System.out.println("Birth Month: "+ friend5.getMonth());
        System.out.println("Birth Year: "+ friend5.getYear());
        System.out.println("Age: "+ friend5.getAge());
        
    }

    private static String nextLine() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
