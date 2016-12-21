import java.util.Calendar;

public class Sunday {
	public static void count() {
		int sd=0;
		Calendar c=Calendar.getInstance();
		for(int y=1901; y<=2000; y++) {
			for(int m=1; m<=12; m++) {
				c.set(y,m,1);
				if(c.get(Calendar.DAY_OF_WEEK)==1) {
					sd+=1;
				}
			}
		}
		System.out.println("First day is Sunday on 20 Century : "+sd);
	}
	public static void main(String[] args) {
		Sunday d=new Sunday();
		d.count();
	}
}