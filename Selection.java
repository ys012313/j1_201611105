package com.sd.ch8;

public class Selection {
    ArrayList<Rectangle> sArr=new ArrayList<Rectangle>();
    public Selection() {}
    public void select(Rectangle r) {
        r.setSelected(true);
        sArr.add(r);
        System.out.println("selected"+r.getSelected());
    }
    public void print() {
        for(Rectangle r:sArr)
            System.out.println(r.toString());
    }

    public static void main(String[] args){
        Rectangle r = new Rectangle(20,40);
        Selection s = new Selection();
        Cube c = new Cube(20,30,40);
            s.select(R);
        s.select(c);
        s.print();
    }
}