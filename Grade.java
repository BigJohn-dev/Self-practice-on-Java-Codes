import java.util.Scanner;
public class Grade{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	


	int counter = 0;
	int total = 0;
	int gradeCounter = 0;
	int num2 = 0;          

	while(gradeCounter <= 10){
	System.out.println("Enter the next grade: " + (gradeCounter + 1));
	int num = input.nextInt();
	int num1 = num  + total;
	gradeCounter = gradeCounter + 1;
	num2 = num1 / 10;
	System.out.printf("Total of all class grade %d",num1);

}
	
	System.out.printf("The average of the class %d%n", num2);



}

}