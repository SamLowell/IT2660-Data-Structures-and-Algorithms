package Assignment4;

import java.util.Scanner;

public class listing {
    private listing next; //links to next node in linked list
    private String name; //key field
    private String idNumber;
    private double gpa;

    Scanner keyboard = new Scanner(System.in);

    public void setName(String Name){
        name = Name;
    }
    public String getName(){
        return name;
    }
    public void setIdNumber(String id){
        idNumber = id;
    }
    public String getIdNumber(){
        return idNumber;
    }
    public void setGpa(double G){
        gpa = G;
    }
    public double getGpa(){
        return gpa;
    }
    public void setNext(listing node){
        next = node;
    }
    public listing getNext(){
        return next;
    }

    public listing(){
        name = "unknown";
        idNumber = "0";
        gpa = 0;
    }
    public listing(String Name, String ID, double G){
        name = Name;
        idNumber = ID;
        gpa = G;
    }
    public String toString(){
        return("Name: " + this.name + "\nID Number: "+ this.idNumber + "\nGrade Point Average: " + this.gpa);
    }
    public listing deepCopy(){
        listing clone = new listing(name, idNumber, gpa);
        return clone;
    }
    public int compareTo(String targetKey){
        return (name.compareTo(targetKey));
    }
    public void input(){
        System.out.println("Enter Student Name: ");
        name = keyboard.next();
        System.out.println("Enter Student ID Number: ");
        idNumber = keyboard.next();
        System.out.println("Enter Student GPA: ");
        gpa = keyboard.nextDouble();
    }
}
