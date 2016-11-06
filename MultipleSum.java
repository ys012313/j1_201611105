class MultipleSum{
	void calculate(){
		int sum = 0;
		for(int i=1; i<1000; i++) {
			if(i%3 == 0 || i%5 == 0) {
				sum += i;
			}
		}
		System.out.println("The Sum is " + sum);
	}
	public static void main(String[] args){
		MultipleSum q = new MultipleSum();
		q.calculate();
	}
}