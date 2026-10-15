package cyberSucess_javaTraining;

public class Loop {
	public static void main (String [] args) {
		char  letter =  'a' ; 
		
		for (int i = 1; i <= 4; i++) {
		
			for (int j = 1 ; j <= i ; j++) {
				
				System.out.print(letter +  " ");
			     	letter++; 
//			     	while (j == 'j') {
//			     		break;
//			     	}
				
			}
			
			System.out.println();
		}
	}

}
