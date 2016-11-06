class CharTriangle{
	int height;
	String symbol;
	void makeCharTriangle(int height, String symbol){
		StringBuffer sbuf=new StringBuffer();
		String a=" ";
		for(int i=0;i<height;i++){
			for(int k=0;k<height-i;k++){
				sbuf.append(a);
			}
			for(int j=0;j<i*2+1;j++){
				sbuf.append(symbol);
			}

			
			System.out.printf("%s\n",sbuf.toString());
			sbuf.delete(0,sbuf.length());
		}
	}
	public static void main(String[] args){
		CharTriangle q=new CharTriangle();
		q.makeCharTriangle(7,"*");
	} 
}
