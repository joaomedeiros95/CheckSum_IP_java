import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Passe o cabeçalho IP com um espaço de 16 em 16 bits.");
		Scanner sc = new Scanner(System.in);
		String hexa = sc.nextLine();
		sc.close();
		
		Calculo calc = new Calculo();
		int[] posicoes = calc.separar(hexa);
		
		int resultado = calc.calculo(posicoes) >>> 16;
		System.out.println(Integer.toHexString(resultado));
		System.out.println(Integer.toBinaryString(resultado));
	}

}
