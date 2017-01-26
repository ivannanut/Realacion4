package EJ1;

public class EJ1R4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3};
		int[] b = {4,5,6,7,2};
		int[] c=ConcatenaArrayPro(a,b);
		
		for(int i=0;i<c.length;i++){
			System.out.print(c[i]);
			if(i<c.length-1)
				System.out.print(",");
		}
		

		
		
	}
		public static int [] ConcatenaArrayPro(int[]a,int[]b){
			int length = a.length + b.length;
			int [] resultado = new int[length];
			System.arraycopy(a, 0, resultado, 0, a.length);
			System.arraycopy(b, 0, resultado, a.length, b.length);
			return resultado;
			
			
			
		}
	
	
	
}
