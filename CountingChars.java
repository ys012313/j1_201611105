import java.util.HashMap;
class CountingChars{
  public static void main(String[] args){
  char[] words = "sangmyung university".toCharArray();
  HashMap<String, Integer> wc = new HashMap<String, Integer>();
  
  for (char c:words){
    String s=Character.toString(c);
    if(wc.containsKey(s)){
      wc.put(s,wc.get(s)+1);
    }
    else{
      wc.put(s,1);
    }
  } 
  System.out.println(wc);
  }
}