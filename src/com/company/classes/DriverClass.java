package com.company.classes;

public class DriverClass {
    public static void main(String[] args){
        house House = new house(20, 10, "tiles", "plaster" );
        System.out.println(House.getnOfDoors());

        House.setnOfDoors(10);
        House.setnOfWindows(20);
        System.out.println("Number of Doors : " + House.getnOfDoors());
        System.out.println("Number of Windows : " + House.getnOfWindows());
        System.out.println("Type of Roof : " + House.getTypeOfRoof());
        System.out.println("Type of Wall : " + House.getTypeOfWall());
    }
}
