import java.util.Scanner;
public class p15_UserinMultDarr {
    public static void main(String[] args) {
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array in n*m form");
        i=sc.nextInt();
        j=sc.nextInt();
        int arr[][]=new int[i][j];
        System.out.println("Enter the elements of array");
        for (int a= 0; a <=i-1; a++) {
            for (int b = 0; b <=j-1; b++) {
                arr[a][b]=sc.nextInt();
            }
            System.out.println("");
        }
        for(int a=0;a<=i-1;a++)
        {
            for(int b=0;b<=j-1;b++)
            {
                System.out.print(arr[a][b]+" ");
            }
            System.out.println("");
        }
    }

}
