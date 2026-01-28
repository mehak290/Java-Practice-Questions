public class lexicographical {
    public static void lexico(int n, int curr){
        if(curr>n){
            return;
        }
        System.out.println(curr+" ");
        for( int i=0;i<9;i++){
            lexico(n, curr*10+i);
        }
    }
    public static void main(String[] args){
        int n =13;
        lexico(n,1);
    }
}
