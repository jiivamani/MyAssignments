package week1.day1;

public class isPrime {
	public static void main(String[] args) {
		int n=17; boolean bprime=true;
		for(int i=2; i<n;i++) {
			if(n%i==0) {
				System.out.println("the given number is not prime number");
				bprime=false;
				break; 
				}
             }
       if(bprime) {
			System.out.println("the given number is prime number");
		}
		}
	}
	

