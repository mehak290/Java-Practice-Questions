public class bitCounting {
    public static void main(String[] args){
        int [] arr={4,4,4,3,3,3,2,2,2,1};
        int result=0;
        for( int i=0;i<32;i++){
            int bitsum=0;

            for( int j=0;j<arr.length;j++){
                if((arr[j] & (1<<i) ) ==1){
                    bitsum++;
                }
            }
            bitsum=bitsum%3;
            if(bitsum!=0){
                result |=(1<<i);
            }
            
        }
        System.out.println("Unique element is "+ result);
    }
}
