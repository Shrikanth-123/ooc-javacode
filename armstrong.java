
public class Armstrong {

	public static void main(String[] args) {
		
		int num, Num1=0, rem=0, res= 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Ënter the number");
		num=sc.nextInt();
        Num1= num;
		while(Num1!=0)
		{
			rem=Num1%10;
			res=res+rem*rem*rem;
			Num1=Num1/10;
			
		}
        if(res == num)
        {
            System.out.println(num + " is an Armstrong number");
        }
        else 
        {
            System.out.println(num+ " is not an Armstrong number");
           
        }
        
	}
}
