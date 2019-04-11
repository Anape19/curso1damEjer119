import java.util.Scanner;

public class HolaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola Mundo");
		for (int i = 0; i < 10; i++) {
			System.out.println("num:\t"+ i);
		}
		Scanner scan = new Scanner(System.in);
		
			System.out.print("Introduce el primer número\t");
			int  num = scan.nextInt();
			System.out.print("Introduce el primer número\t");
			int num2 = scan.nextInt();
			System.out.printf("la suma es %d%n",(num + num2));
		
		
		
		
	}

}
