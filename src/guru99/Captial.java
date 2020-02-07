package guru99;

public class Captial {

	public static void main(String[] args) {
		String s = "my name is srinivas";
		char [] c = s.toCharArray();
		
		//System.out.println(c);
		   
		for (int i=0;i<c.length;i++) {
			
			if (i==0) {
			c[i]=Character.toUpperCase(c[i]);
			System.out.println(c[i]);
				
			}
			if(c[i]==' ') {
			 i++;
			c[i]=Character.toUpperCase(c[i]);
			System.out.println(c[i]);
			}
			
		}
		System.out.println(c);

	}
	
	
}
