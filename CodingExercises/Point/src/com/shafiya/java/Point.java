package com.shafiya.java;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Point(){
        this(0, 0);
    }

    public void setY(int y) {
        this.y = y;
    }
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }
    public int getX() {
        return x;
    }

    public double distance(){
        return (double)Math.sqrt((-this.x) * (-this.x) + (-this.y) * (-this.y));
    }
    public double distance(int x, int y){
        return (double)Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }
    public double distance(Point p){
        return distance(p.x, p.y);
    }
}
