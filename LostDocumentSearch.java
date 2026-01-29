/*A records room contains thousands of files arranged in a line. A clerk is asked to find the first
occurrence of a document with a specific reference number. He checks one file at a time and if
it doesn’t match, asks the same process to continue from the next file.
Task:
Write a recursive function to find the first index of the given document number.*/


public class LostDocumentSearch {
    public static int LostDocSearch(int arr[],int i,int key){
        if(i==arr.length-1) return 0;
        if(arr[i]==key) return i;
         return LostDocSearch(arr, i+1, key);
    }   
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        int key=4;
        System.out.println(LostDocSearch(arr,0,key));
    }
}
