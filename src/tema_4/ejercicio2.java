package tema_4;

import java.util.Arrays;
import java.util.Scanner;
public class ejercicio2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String num_string = "";
		int num = 0;
		System.out.println("ESCRIBE ENTEROS HASTA ESCRIBIR fin");
		int[] arreglo = new int[1];
		int contador = 0;

		while(true){
			if(num_string.equals("fin")){
				break;
			}
			num_string = entrada.next();
			try{
				num = Integer.parseInt(num_string);
				arreglo[contador] = num;
				contador++;
				arreglo = Arrays.copyOf(arreglo, contador+1);

			}catch(NumberFormatException e){
				
			}
		}
		mayor(arreglo);
	}
	static void mayor(int... nums){
		Arrays.sort(nums);
		System.out.println("El mayor número es:" + nums[nums.length-1]);
	}

}