package org.example;

public class Point{
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public double distance(){
        double result = Math.sqrt( this.x * this.x + this.y * this.y);
        return result;
    }

    public double distance(Point p){
        double result = Math.sqrt( (this.x - p.x) * (this.x - p.x) + (this.y - p.y) * (this.y - p.y));
        return result;
    }

    public double distance(double a, double b){
        double result = Math.sqrt( (this.x - a) * (this.x - a) + (this.y - b) * (this.y - b));
        return result;
    }
}
