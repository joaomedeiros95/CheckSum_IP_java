
public class Calculo {
	public int calculo (int[] ip) {
		int resultado = 0;
		for(int i = 0; i < ip.length; i++) {
			resultado += ip[i];
		}
		if (resultado > 0xFFFF)
			resultado = split(resultado);
		return ~resultado << 16;
	}
	
	public int[] separar (String hexa) {
		String[] posicoes = hexa.split(" ");
		int[] numeros = new int[posicoes.length - 1];
		try {
			for(int i = 0, j = 0; posicoes[i] != null; i++) {
				if (i != 5) {
					numeros[j] = paraInt(posicoes[i]);
					j++;
				}
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			//nothing
		}
		return numeros;
	}
	
	public int paraInt(String hexa) {
		return Integer.parseInt(hexa, 16);		
	}
	
	public int split(int numero) {
		while (numero >>> 16 != 0) numero = (numero & 0xFFFF)+(numero >>> 16);
		return numero;
	}
}
