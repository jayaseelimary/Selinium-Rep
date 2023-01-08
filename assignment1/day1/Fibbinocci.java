package assignment1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int firstNum =0;
		int secNum =1;
		int sum =0;
		for (int i = 0; i < 11; i++) {
			
			System.out.println(firstNum);
			
			sum=firstNum+secNum;
			firstNum=secNum;
			secNum=sum;
		}
		
	}

}
