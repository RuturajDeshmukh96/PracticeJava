package cyberSucess_javaTraining;

public class Loop {
	public static void main (String [] args) {
		char  letter =  'a' ; 
		
		for (int i = 1; i <= 4; i++) {
		
			for (int j = 1 ; j <= i ; j++) {
				
				System.out.print(letter +  " ");
			     	letter++; 
				
			}
			
			System.out.println();
		}
		System.out.println("New Task ");
		char letter1 = 'a';
		
		for (int i = 4 ; i >=1 ; i--) {
			
			for (int j = 1 ; j <= i ; j++) {
				
				System.out.print(letter1);
			
			}
			System.out.println();
			letter1++;
		}
	}

}
