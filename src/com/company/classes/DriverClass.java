package com.company.classes;

public class DriverClass {
    public static void main(String[] args){
        house House = new house();
        System.out.println(House.getnOfDoors());

        House.setnOfDoors(10);
        House.setnOfWindows(20);
        System.out.println("Number of Doors : " + House.getnOfDoors());
        System.out.println("Number of Windows : " + House.getnOfWindows());
    }
}
