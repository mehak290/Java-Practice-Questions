public class coinTossProblem {
    public static void coin(int i,String h){
        //base case
        if(i==0)
            {
                System.out.println(h);
                 return;
                }

        coin(i-1,h+"H");
        coin(i-1,h+"T");

    }
    public static void main(String [] args){
        int n=2;
        coin(n,"");
    }
}
