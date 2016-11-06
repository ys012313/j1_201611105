import java.util.Calendar;
class CountSunday{
	int sunday=0;
	void count(){
		Calendar c=Calendar.getInstance(); 
		for(int y=1901; y<2001; y++){
			for(int m=0;m<12;m++){
				c.set(y,m,1);
				if(c.get(Calendar.DAY_OF_WEEK)==1){
					sunday=sunday+1;
				}
			}
		}
		System.out.println("There is "+sunday+" sunday between 1901~2000");
  }
	public static void main(String[] args){
		CountSunday q=new CountSunday();
		q.count();
	}
}