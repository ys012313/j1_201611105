 public class Rectangle {
   ...>    private int width;
   ...>    private int height;
   ...> public Rectangle (int width, int height) {
   ...>    this.width=width;
   ...>    this.height=height;
   ...> }
   ...> public int getWidth() {
   ...>    return width;
   ...> }
   ...> public int getHeight() {
   ...>    return height;
   ...> }
   ...> public void setWidth(int newWidth) {
   ...> width=newWidth;
   ...> }
   ...> public void setHeight(int newHeight) {
   ...> height=newHeight;
   ...> }
   ...> public void setSize(int width, int height) {
   ...> setWidth(width);
   ...> setHeight(height);
   ...> }
   ...> public int calcArea() {
   ...>
   ...>    return width*height;
   ...> }
   ...> }
|  Warning:
|  Modifier 'public'  not permitted in top-level declarations, ignored
|  public class Rectangle {
|  ^----^
|  created class Rectangle this error is corrected:
|      Modifier 'public'  not permitted in top-level declarations, ignored
|      public class Rectangle {
|      ^----^

jshell> Rectangle q=new Rectangle(6,6);
q ==> Rectangle@239963d8

jshell> q.calcArea();
$3 ==> 36

jshell> q.setSize(3,3);

jshell> q.calcArea();
$5 ==> 9