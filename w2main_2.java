jshell> class Subway {
   ...>   int line;
   ...>   void run() { System.out.println("4lines runs");
   ...>   }
   ...> }
|  created class Subway

jshell> Subway mySub=new Subway();
mySub ==> Subway@31610302

jshell> mySub.run()
4lines runs

jshell> class Subway {
   ...>   int line;
   ...>   void run() { System.out.println (line + "lines runs");
   ...>   }
   ...>   void setLine(int l) {
   ...>     line=l;
   ...>   }
   ...> }
|  replaced class Subway
|    update replaced variable mySub, reset to null

jshell> Subway mySub=new Subway();
mySub ==> Subway@52a86356

jshell> mySub.setLine(1);
            ^

jshell> mySub.run();
1lines runs