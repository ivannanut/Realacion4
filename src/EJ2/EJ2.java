package EJ2;

import java.util.Arrays;

public class EJ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] a = {1,2,3};
		int[] b;
		b = CopiaArrayPro(a);
		mostrar(b);
		
		
	
		}
		public static int [] CopiaArrayPro(int[]a){
			int [] array =Arrays.copyOf(a, 3);
			return array;
		}
	

		public static void mostrar(int[]c){
		for(int i=0;i<c.length;i++){
			System.out.print(c[i]);
			if(i<c.length-1)
				System.out.print(",");
		
		}
		}
}


