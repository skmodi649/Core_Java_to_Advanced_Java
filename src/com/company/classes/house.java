package com.company.classes;

public class house {
    private int nOfWindows;
    private int nOfDoors;
    private String typeOfRoof;
    private String typeOfWall;

    public house(){
        nOfWindows = 0;
        nOfDoors = 0;
        typeOfRoof = null;
        typeOfWall = null;
    }

    public house(int nOfWindows, int nOfDoors, String typeOfRoof, String typeOfWall){
        this.nOfDoors = nOfDoors;
        this.nOfWindows = nOfWindows;
        this.typeOfRoof = typeOfRoof;
        this.typeOfWall = typeOfWall;
    }

    public int getnOfDoors() {
        return nOfDoors;
    }

    public void setnOfDoors(int nOfDoors) {
        this.nOfDoors = nOfDoors;
    }

    public int getnOfWindows() {
        return nOfWindows;
    }

    public void setnOfWindows(int nOfWindows) {
        this.nOfWindows = nOfWindows;
    }

    public String getTypeOfRoof() {
        return typeOfRoof;
    }

    public void setTypeOfRoof(String typeOfRoof) {
        this.typeOfRoof = typeOfRoof;
    }

    public String getTypeOfWall() {
        return typeOfWall;
    }

    public void setTypeOfWall(String typeOfWall) {
        this.typeOfWall = typeOfWall;
    }
}
