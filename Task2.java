import java.util.Arrays;
import java.util.OptionalInt;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(repeat("hello",3));
        System.out.println(differenceMaxMin(new int[] {10, 4, 1, 4, -10, -50, 32, 21}));
        System.out.println(isAvgWhole(new int[] {1, 3}));
        System.out.println(Arrays.toString(cumulativeSum(new int[]{3, 3, -2, 408, 3, 3})));
        System.out.println(getDecimalPlaces("3.1567"));
        System.out.println(Fibonacci(7));
        System.out.println(isValid("59a01"));
        System.out.println(isStrangePair("sparkling", "groups"));
        System.out.println(isPrefix("retrospect", "sub-"));
        System.out.println(isSuffix("arachnophobia", "-phobia"));
        System.out.println(boxSeq(4));
    }
    //№1
    public static String repeat(String a,int b){
        String s = "";
        for (int i = 0;i < a.length();i ++){
            s += String.valueOf(a.charAt(i)).repeat(b);
        }
        return s;
    }
    //№2
    public static int differenceMaxMin(int[] a) {
        OptionalInt max = Arrays.stream(a).max();
        OptionalInt min = Arrays.stream(a).min();
        return (max.getAsInt() - min.getAsInt());
    }
    //№3
    public static boolean isAvgWhole(int[] a) {
        int sum = Arrays.stream(a).sum();
        int l = a.length;
        if (sum/l == ((float)sum/(float)l)){
            return true;
        } else {
            return false;
        }
    }
    //№4
    public static int[] cumulativeSum(int[] a) {
        int s = 0;
        int[] arr = new int[a.length];
        for (int i = 0;i < a.length;i++){
            arr[i] = a[i] + s;
            s += a[i];
        }
        return arr;
    }
    //№5
    public static int getDecimalPlaces(String a) {
        int k = a.indexOf(".");
        if (k == -1){
            return 0;
        } else {
            return a.length()-k-1;
        }
    }
    //№6
    public static int Fibonacci(int a) {
        int f1 = 1;
        int f2 = 1;
        int fi = 0;
        if (a == 1 | a == 2){
            return 1;
        } else {
            for (int i = 2; i <= a; i++) {
                fi = f1 + f2;
                f1 = f2;
                f2 = fi;
            }
            return fi;
        }
    }
    //№7
    public static boolean isValid(String a) {
        if (a.length() == 5 &
                Character.isDigit((a.charAt(0))) &
                Character.isDigit((a.charAt(1))) &
                Character.isDigit((a.charAt(2))) &
                Character.isDigit((a.charAt(3))) &
                Character.isDigit((a.charAt(4)))){
            return true;
        } else {
            return false;
        }
    }
    //№8
    public static boolean isStrangePair(String a, String b) {
        if (a == "" & b == "") {
            return true;
        } else if (a == "" | b == ""){
            return false;
        } else if (a.charAt(0) == b.charAt(b.length()-1) & a.charAt(a.length()-1) == b.charAt(0)){
            return true;
        } else {
            return false;
        }
    }
    //№9
    public static boolean isPrefix(String a, String b) {
        int k = b.length() - 2;
        if (a.substring(0, k).equals(b.substring(0, k))){
            return true;
        } else {
            return false;
        }
    }
    public static boolean isSuffix(String a, String b) {
        int k = b.length() - 1;
        if (a.substring(a.length()-k).equals(b.substring(1))){
            return true;
        } else {
            return false;
        }
    }
    //№10
    public static int boxSeq(int a) {
        if (a % 2 == 0){
            return a;
        } else {
            return a + 2;
        }
    }
}
