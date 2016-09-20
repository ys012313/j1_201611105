jshell> class Hello {
   ...>    String toWhom="java";
   ...>    Hello() {}
   ...>    void sayHello() {
   ...>       System.out.println("hello "+toWhom);
   ...>    }
   ...> }
|  created class Hello

jshell> Hello h=new Hello();
h ==> Hello@239963d8

jshell> h.sayHello();
hello java