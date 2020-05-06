public class ArrayIndex {
	 public static void main(String args[])
	  {
	    int marks[] = { 60, 70, 80 };
	    System.out.println("Hello 1");
	 
	    try
	    {
	      int m = marks[3];                          
	      System.out.println("Marks are " + m);
	    }
	    catch(ArrayIndexOutOfBoundsException e)
	    {
	      System.out.println("Do not cross size of array sir."  + e );
	    }
	    System.out.println("Hello 2");
	    System.out.println("Hello 3");
	  }

}
