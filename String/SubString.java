

public class SubString{

    public static String subString(String str,int si, int ei){
        String subStr = "";
        for (int i=si;i<ei;i++){
            subStr += str.charAt(i);
        }
        return subStr;
    }

    public static void getLargestString(String arr[]){
        String largest = arr[0];
        for(int i=1;i<arr.length;i++){
            if(largest.compareTo(arr[i])<0){
                largest = arr[i];
            } 
        }
        System.out.println(largest);
    }
    public static void main(String[] args) {
        String str = "Hello World";
        String fruits[]= {"apple","mango","banana","mangoes"};
        System.out.println(str.substring(0,5));
        System.out.println(subString(str,0,4));
        getLargestString(fruits);
    }
}