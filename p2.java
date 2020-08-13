import java.util.Scanner;

public class p2 {
    void sum(int ip1,int ip2)
    {
        System.out.println(ip1+ip2);
    }
    void sum(String s1,String s2)
    {
        System.out.println(s1+s2);
    }
    public static void main(String[] args) {
        p2 obj=new p2();
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        int operation = sc.nextInt();
        if(operation == 1)
        {
            int ip1=0;
            int ip2=0;
            for(int i=0;i<input1.length();i++)
            {
                ip1+=input1.charAt(i);
            }
            for(int i=0;i<input2.length();i++)
            {
                ip2+=input2.charAt(i);
            }
            obj.sum(ip1,ip2);
        }
        else if(operation == 2)
        {
            obj.sum(input1,input2);
        }
        else
        {
            int ip1=Integer.parseInt(input1);
            int ip2=0;
            for(int i=0;i<input2.length();i++)
            {
                ip2+=input2.charAt(i);
            }
            obj.sum(ip1,ip2);
        }
    }
}