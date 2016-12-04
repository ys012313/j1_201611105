package com.sd.ch8;

public class CirleIs extends Shape{
  private double radius;
  private double area; 
  private double perimeter;

  public CircleIs(double radius){
    this.radius=radius;
    this.area=Math.PI*radius*radius;
    this.perimeter=2*Math.PI*radius;
  }

  public double calcArea(){
    return this.area;
  }

  public double calcPerimeter(){
    return this.perimeter;
  }
 
  public String toString(){
    return "CircleIs..."+super.toString();

  }
    public static void main(String[] args){
    CircleIs c=new CircleIs(5);
    System.out.println("Area = "+c.calcArea());
    System.out.println("Perimeter = "+c.calcPerimeter()); 
    System.out.print(c.toString());
  }
}