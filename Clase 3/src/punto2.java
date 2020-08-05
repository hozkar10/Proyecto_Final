import java.util.Scanner;

public class punto2 {

	public punto2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		int edad = 0;

		System.out.println("Introduzca su edad");

		edad = reader.nextInt();

		if (edad >= 18) {
			System.out.println("Es mayor de edad");
		} else {
			System.out.println("Es menor de edad");
		}

	}
}
