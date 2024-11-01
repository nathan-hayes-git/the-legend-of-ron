package com.ron.tlor;

public class Board {
    public Board(int xCoordinates, int yCoordinates){
        this.setYCoordinates(yCoordinates);
        this.setXCoordinates(xCoordinates);
    }

    private int xCoordinates;
    private int yCoordinates;

    public int getXCoordinates() {
        return xCoordinates;
    }
    public int getYCoordinates() {
        return yCoordinates;
    }
    public void setXCoordinates(int xCoordinates) {
        this.xCoordinates = xCoordinates;

    }
    public void setYCoordinates(int yCoordinates) {
        this.yCoordinates = yCoordinates;
    }










}
