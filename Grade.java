class Grade {
  public static void makeGrade(double score) {
    if (90<=score && score<=100) {System.out.println("A");}
    else if (80<=score && 90<score) {System.out.println("B");}
    else if (70<=score && 80<score) {System.out.println("C");}
    else if (60<=score && 70<score) {System.out.println("D");}
    else {System.out.println("F");}

    }
    public static void main(String[] args) {
      makeGrade(88);
    }
}