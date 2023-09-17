package task4;

import task3.Name;

import java.util.Scanner;

public class Computer extends Memory{
    private String name;

    public Computer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        System.out.println("Какой компьютор вы любите: HP, Apple, Huawei");
        Scanner sc= new Scanner(System.in);
        String s =sc.next().toUpperCase();
        NameComputer nameComp = NameComputer.valueOf(s);
        Computer myComp = new Computer(nameComp.toString());
        myComp.nameMem = "Memory" + myComp.name;
        myComp.nameMon = "Monitor" + myComp.name;
        myComp.nameP = "Processor" + myComp.name;
        System.out.println( myComp.nameMem);
        System.out.println( myComp.nameMon);
        System.out.println( myComp.nameP);
    }
}
