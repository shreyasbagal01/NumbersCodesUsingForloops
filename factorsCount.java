class Demo{
	public static void main(String [] args){
		int x=6;
		int count =0;
		for(int i=1;i<=x;i++){
			if(x%i==0){
				count++;
			}
		}System.out.println(count);
	}
}
