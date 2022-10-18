public class Task1 {
    public static void main(String[] args) {
        System.out.println(remainder(1,3));
        System.out.println(triArea(3,5));
        System.out.println(animals(2,3,5));
        System.out.println(profitableGamble( 0.2f,50,9));
        System.out.println(operation(15,5,3));
        System.out.println(ctoa('A'));
        System.out.println(addUpTo(3));
        System.out.println(nextEdge(8,10));
        System.out.println(sumOfCubes(new int[] {3,4,5}));
        System.out.println(abcmath(5,2,1));
    }
//№1
    public static int remainder(int a,int b){
        return a % b;
    }
//№2
    public static float triArea(float a,float b){
            return (a*b)/2;
    }
//№3
    public static int animals(int a,int b,int c){
        return a*2+b*4+c*4;
    }
//№4
    public static boolean profitableGamble(float prob,float prize,float pay){
        return prob * prize > pay;
    }
//№5
    public static String operation(int n,int a,int b){
        if (a+b == n){
            return "added";
        } else if (a-b == n){
            return "subtracted";
        } else if (a*b == n){
            return "multiply";
        } else if (a/b == n){
            return "divide";
        } else {
            return "none";
        }
    }
//№6
    public static int ctoa(char a){
        int ascii = a;
        return a;
    }
//№7
    public static int addUpTo(int a){
        int s = 0;
        for (int i = 1;i <= a; i++){
            s += i;
        }
        return s;
    }
//№8
    public static int nextEdge(int a,int b){
        return a+b-1;
    }
//№9
    public static int sumOfCubes(int[] a){
        int s = 0;
        for (int i = 0;i < a.length;i++){
            s += a[i]*a[i]*a[i];
        }
        return s;
    }
//№10
    public static boolean abcmath(int a,int b,int c){
        for (int i = 0;i > b; i++){
            a += a;
        }
        return a % b == 0;
    }
}
