package TryCatchApp;

public class multipleException {

	public static void main(String[] args) {

		 try{
			 
			 
			 TryCatchClass myCatch = new TryCatchClass();
			 
			 myCatch.catchException();
	        }
	      catch(ArithmeticException e){
	         System.out.println("You should not divide a number by zero");
	      }
	      catch(ArrayIndexOutOfBoundsException e){
	         System.out.println("Accessing array elements outside of the limit");
	      }
		 
		 catch(NullPointerException ex) {
	    		System.out.print("Your array is null");
	    		
		 
	      }catch(Exception e){
	         System.out.println("Some Other Exception");
	      }finally {
	    	  System.out.println("Getting better at Exception handling");
	    	  
	      }
	      
	   }
	
	


}
