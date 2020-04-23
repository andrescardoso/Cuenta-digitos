// CUENTA LA CANTIDAD DE NUMEROS CON CANTIDAD DE CIFRAS PARES
public class ContadorCifras {
	
	public static int numerosCifrasPares(int[]nums) {
		int cont=0;
		for (int i = 0; i < nums.length; i++) {
			int n=nums[i];
			int cifras=0;
			while(n!=0) {
				n=n/10;
				cifras++;
			}
			if(cifras%2==0) {
				cont++;
			}
		}
		return cont;
	}
	
	public static void main(String[] args) {
		int[] numeros = {1, 42, 34, 779, 887};
		System.out.println(numerosCifrasPares(numeros));
	}
}
