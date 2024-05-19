package lambda_practise;
//import java.util.function.*;
	public class Winter 
	{

	public static void main(String[] args) 
	{
		Predicate<String> s = x -> x.endsWith("l");
		 String name = "ismail";
         System.out.println(name+"is a leap year : "+s.test(name));
	}

}
