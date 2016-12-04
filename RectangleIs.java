package com.sd.ch8;
public class RectangleIs extends Shape{
  private double width;
  private double height; 
  private double area;
  private double perimeter;
  public RectangleIs(double width, double height){
    this.width=width;
    this.height=height;
    this.area=width*height;
    this.perimeter=2*(width+height);
  }

  public double calcArea(){
    return this.area;
  }

  public double calcPerimeter(){
    return this.perimeter;
  }

  public String toString(){
    return "RectangleIs..."+super.toString();
  }

  public static void main(String[] args){
    RectangleIs r=new RectangleIs(10,15);
    System.out.println("Area is "+r.calcArea());
    System.out.println("Perimeter is "+r.calcPerimeter()); 
    System.out.print(r.toString());
  }
}