class Leapyear{
  void Find(int year){
    if((year%4 == 0) && (year%100! = 0) || (year%400 == 0)){ 
      System.out.println("This year is a Leap year");
    } 
    else { 
     System.out.println("This year is not a Leap year");
    } 
  }
  public static void main(String[] args){
    Leapyear q=new Leapyear();
    int[] years={1800,1900,1912,1984,1985,2000,2015,1825,1928,2031,1845,1947,2053,2099};
    for(int y:years){
      q.Find(y);
    }
  }
} 