class BMI{
	void myBMI(float weight, float height){
		float bmi=(float) weight/ (height * height);
		if(bmi < (float)18.5){
			System.out.println("You are low state");
		}
		else if((float)18.5 <= bmi && bmi <(float)23){
			System.out.println("Your are normal state");
		}
		else if((float)23 <= bmi && bmi <(float)25){
			System.out.println("You are at risky");	
		}
		else if((float)25<= bmi && bmi <(float)30){
			System.out.println("You are at obesity 1");
		}
		else if((float)30<= bmi && bmi <(float)40){
			System.out.println("You are at obesity 2");
		}
		else if(bmi>(float)40){
			System.out.println("You are at obesity 3");
		}
		else{
			System.out.println("Error");
		}
	}
	public static void main(String[] argv){
		BMI q = new BMI();
		q.myBMI(67,(float)1.8);
	}
}