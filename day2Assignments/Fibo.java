package week1.day2Assignments;

public class Fibo {

	public static void main(String[] args) {
		int range = 8;
		int firstNum = 0;
		int nextNum = 1;
		int sum=0;
		System.out.println(firstNum);
		System.out.println(nextNum);
		for (int i =2; i < range; i++) {
			
			sum = firstNum+nextNum;
			firstNum = nextNum;
			nextNum = sum;
			 System.out.println(sum);
					}
	}

}
 