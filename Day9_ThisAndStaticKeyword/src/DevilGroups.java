import java.util.Scanner;

class DevilGroups
{
     public static void main(String[] args)
    {
          Scanner sc=new Scanner(System.in);
          String str=sc.next();
          str=str.replace("@"," ");
          str=str.replace("$"," ");
          String arr[]=str.split(" ");
          int max=0;
          for(int i=0;i<arr.length;i++) 
             max=Math.max(max,arr[i].length()); 
         System.out.println(max);
}
}