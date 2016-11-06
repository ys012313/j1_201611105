class RSP{
  void start(String P1, String P2){
    String a="P1 win!";
    String b="P2 win!";
    String c="Draw!";
      if (P1.equals("s")&&P2.equals("r")){
        System.out.println(a);
      }
      else if (P1.equals("s")&&P2.equals("s")){
        System.out.println(b);
      }
      else if (P1.equals("s")&&P2.equals("p")){
        System.out.println(c);
      }
      else if (P1.equals("r")&&P2.equals("r")){
        System.out.println(c);
      }
      else if (P1.equals("r")&&P2.equals("s")){
        System.out.println(a);
      }
      else if (P1.equals("r")&&P2.equals("p")){
        System.out.println(b);
      }
      else if (P1.equals("p")&&P2.equals("r")){
        System.out.println(a);
      }
      else if (P1.equals("p")&&P2.equals("s")){
        System.out.println(b);
      }
      else if (P1.equals("p")&&P2.equals("p")){
        System.out.println(c);
      }
  }
  public static void main(String[] args){
    new RSP().start("r","p"); }
}