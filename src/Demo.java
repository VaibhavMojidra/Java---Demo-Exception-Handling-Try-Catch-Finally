
public class Demo {
	public static void main(String[] args) {
			int[] arr = new int[4];
			
	        try
	        {
	            int i = arr[4];
	            
	            System.out.println("Inside try block");
	        }
	         
	        catch(ArrayIndexOutOfBoundsException ex)
	        {
	            System.out.println("Exception caught in catch block");
	        }
	         
	        finally
	        {
	        	//This can use in case of actions that needs to be done whether or not error as occured eg: close of file object  
	            System.out.println("finally block executed");
	        }
	         
	        
	        System.out.println("Outside try-catch-finally clause");
	}
}
