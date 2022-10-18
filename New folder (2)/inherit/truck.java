package inherit;

public class truck extends car {
	int b = 6;
      public void add() {
    	  System.out.println( " we are using single inheritance   "   +b);
      }
      
	public static void main(String[] args) {

		truck d = new truck();
         d.sub();  // parent class 
         d.add();  // child class
        
	}

}
