import java.util.ArrayList; 

public class NumberSum{ 
  int sum=0; 
	ArrayList<Integer> TheSum = new ArrayList<Integer>(); 
	void Numbers(){ 
		for(int i=0; i<=1000; i++){ 
			if(i%4==0 && i%5!=0){ 
				TheSum.add(i); 
			} 
		} 
		System.out.println("The Sum is "+TheSum); 
		for(int q:TheSum){ 
			sum=sum+q; 
		} 
		System.out.println("The Sum of Number is "+sum); 
	} 		
	public static void main(String[] args) { 		
		new NumberSum().Numbers(); 
  } 
} 