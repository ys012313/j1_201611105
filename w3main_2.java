class BrazilCoffee {
   String origin;
   int roast;
   int grade;
   BrazilCoffee(String o) {
      origin=o;
   }
   public void roast() {
      System.out.println("Roasting from "+origin);
   }
   public void grind() {
      System.out.println("Grinding from "+origin);
   }
   public void brew() {
      System.out.println("Brewing from "+origin);
   }
}
BrazilCoffee a=new BrazilCoffee("Brazil");
a.roast();
a.brew();
a.grind();