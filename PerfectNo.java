class Demo{
	public static void main(String []args){
		int x=8;
		int sum =0;
		for(int i=1;i<x;i++){
			if(x%i==0){
				sum=sum+i;
			}
		}if(sum==x){
			System.out.println("Perfect Numbers");
		}else{
			System.out.println("Not Perfect Number");
		}
	}
}
