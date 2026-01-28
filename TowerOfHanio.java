public class TowerOfHanio {
    public static void hanoi(char source, char helper, char destination, int n){
        if(n==0){
            return;
        }
        hanoi(source,destination,helper,n-1);
        System.out.println("Move disk "+n+" from "+ source+" to "+destination);
        hanoi(helper,source,destination,n-1);
    }
    public static void main (String[] args){
        hanoi('A', 'B', 'C', 3);
    }
}
