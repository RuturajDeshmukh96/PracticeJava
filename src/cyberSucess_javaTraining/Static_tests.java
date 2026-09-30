package cyberSucess_javaTraining;

public class Static_tests {
	
      static class rutu {
    	  private void sysom() {
    		  System.out.println("This is from the nested static class : ");
    		  
    	  }
      }
      public static void main(String[] args) {
    	  Static_tests . rutu obj = new Static_tests.rutu ();
    	  
    	 obj.sysom();
	}
      }

// static = we can create static class only inside a class means nested class 
// for creating object of that class we need to create first main class then nested class using . 
// for example Main.static_class c1 = new Main.static_class ();