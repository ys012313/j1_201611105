import ch.aplu.turtle.*;

public class TurtleTracksMain{
  static void drawSquareFrom(double[][] tracks){
    Turtle t1=new Turtle();
    for(double[] t:tracks){
      t1.moveTo(t[0],t[1]);
    }
  }
  
public static void main(String[] args){
  double[][]
  tracks={{0,0},{0,50},{50,50},{50,0},{0,0}};
  new TurtleTracksMain().drawSquareFrom(tracks);
  }
}