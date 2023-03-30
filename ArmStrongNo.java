class Demo{
	public static void main(String []args){
		int x=153;
		int temp=x;
		int sum=0;
		while(x!=0){
			int rem=x%10;
			sum=sum+(rem*rem*rem);
			x=x/10;
		}if(temp==sum){
			System.out.println("ArmStrong Numbers");

		}else{
			System.out.println("Not ArmStrong Numbers");
		}
	}
}
