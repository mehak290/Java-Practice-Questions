public class BoardPathProblem {
    public static void path(int curr, String ans,int dest){
        //destination reached
        if(dest==curr){
            System.out.println(ans);
            return;
        }
        //destination is crossed
        if(dest<curr){
            return;
        }
        //finding destination
        for( int dice=1; dice<dest;dice++){
            path(curr+dice,ans+dice,dest);
        }
        
    }
    public static void main(String[] args){
        int n=5;
        path(0,"",n);
    }
}
