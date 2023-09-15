public class Main {

    public static void main(String[] args) {
        System.out.println(roundNegativeValueToNearestInteger(-8.45));
    }

    // 1. add
    public static int add(int a,int b){
        return a+b;
    }
    
    // 2. add
    public static int add(int a,int b,int c,int d){
        return add(add(add(a,b),c),d);
    }

//     3. morningGreeting
    public static String morningGreeting(String name){
        return "早上好, "+name+"!";
    }
    // 4. afternoonGreeting
    public static String afternoonGreeting(String name){
        return "下午好, "+name+"!";
    }

    // 5. triple
    public static String triple(String word){
        return word+word+word;
    }

    // 6. half
    public static double half(int num){
        return num/2.0;
    }

    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double num){
        return (int)Math.round(num);
    }
    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double num){
        double posNum = num*-1;
        int posAns = (int)Math.round(posNum);
        return -1*posAns;
    }
}
