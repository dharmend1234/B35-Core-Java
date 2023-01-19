import java.util.Scanner;

public class copycase {

	public static void main(String[] args) {
		String str1;
		String str2 = "cat";
		System.out.println("Copy Case Finder");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Rahul word");
		str1=s.next();
		if(str1.equals(str2))
				{
			System.out.println("Answer is Correct");
				}
		else
		{
			System.out.println("Answer is Wrong");
		}
		
s.close();
	}

}
