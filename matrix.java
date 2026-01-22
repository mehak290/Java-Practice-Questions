import java.util.*;
public class matrix {
    public static void main(String[] args){
       Scanner sc= new Scanner (System.in);
       int arr[][]= new int[3][3];
       int rowstart=0;
       int rowend=2;
       int colstart=0;
       int colend=2;
       System.out.println("Enter nos");
       while(rowstart<=rowend && colstart<=colend){
        for( int i=colstart;i<=colend;i++){
            arr[rowstart][i]=sc.nextInt();
        }
        rowstart++;
        for( int i=rowstart;i<=rowend;i++){
            arr[i][colend]=sc.nextInt();
        }
        colend--;
        for( int i=colend;i>=colstart;i--){
            arr[rowend][i]=sc.nextInt();
        }
        rowend--;
        for( int i=rowend;i>=rowstart;i--){
            arr[i][colstart]=sc.nextInt();
        }
        colstart++;
       }
       for( int i=0;i<3;i++){
        for( int j=0;j<3;j++){
            System.out.print(arr[i][j]);
        }
        System.out.println();
       } 
       System.out.print("sum of daigrnol elemets is :");
       int sum=0;
       for( int i=0;i<3;i++){
        for( int j=0;j<3;j++){
            if(i==j){
            sum+=arr[i][j];}
        }
       }
       System.out.println(sum);
       sc.close();
    }
}
