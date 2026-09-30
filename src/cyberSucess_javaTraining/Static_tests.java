package cyberSucess_javaTraining;

public class Static_tests {
	
      static class rutu {
    	  private void sysom() {
    		  System.out.println("This is from the nested static class");
    		  
    	  }
      }
      public static void main(String[] args) {
    	  Static_tests . rutu obj = new Static_tests.rutu ();
    	  
    	 obj.sysom();
	}
      }
