public class fizzBuzz{
	public static void main(String[] args){
		int fizz=3;
		int buzz=5;
		int fizz-buzz=fizz*buzz;
		
		for(int i=0;i<=100;i++){
			if((i%fizz==0)&&(!fizz-buzz)){
				System.out.println("Fizz");
			}else if((i%buzz==0)&&(!fizz-buzz)){
				System.out.println("Buzz");
			}else if(i%fizz-buzz==0){
				System.out.println("Fizz-Buzz");
			}else{
				System.out.println(i);
			}
	}

}