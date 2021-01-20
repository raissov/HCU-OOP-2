package com.company;

public class Square extends Rectangle{
    public Square() {
        super();
    }

    public Square(double side) {
        super(side,side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }
    public double getSide(){
        return this.getWidth();
    }
    public void setSide(double side){
        this.setWidth(side);
        this.setLength(side);
    }

    @Override
    public void setWidth(double width) {
        this.setSide(width);

    }

    @Override
    public void setLength(double length) {
        this.setSide(length);
    }
    @Override
    public String toString() {
        return "Square " +
                "side="+getSide();
    }

    @Override
    public double getArea() {
        return this.getWidth() * this.getWidth();
    }

    @Override
    public double getPerimeter() {
        return this.getWidth() * 4;
    }
}
