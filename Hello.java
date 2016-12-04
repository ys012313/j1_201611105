package com.sd.ch8;

public class Hello{
  private String name;
  public Hello(String name){
    this.name=name;
  }

  public void sayHello(){
    System.out.println("Hello "+name);
  }

  public static void main(String[] args){
    Hello[] h = new Hello[5];
    h[0]= new Hello("jsh");
    h[1]= new Hello("jyj");
    h[2]= new Hello("ycj");
    h[3]= new Hello("jsm");
    h[4]= new Hello("kmj");
    for(Hello e:h){
      e.sayHello();
    }
  }
}