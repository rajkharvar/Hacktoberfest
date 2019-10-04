import java.util.Scanner;
public class SqrtWithoutInBuildFunction
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int x = sc.nextInt();
        sc.close();
        int l = 0;
        int h = x;
        int t = -1;
        Boolean flag = true;
        if(x==1)
        {
            System.out.println("SQRT is " + x);
            flag = false;
        }
        while(flag)
        {
            int m = (l + h )/ 2;
            if(t == m)
            {
                System.out.println("We cant find Root");
                break;
            }
            if(m*m == x)
            {
                System.out.println("SQRT is " + m);
                break;
            }
            else if(m*m > x)
            {
                h = m;
            }
            else{
                l = m;
            }
            t = m;
         

        }
        
    }
}