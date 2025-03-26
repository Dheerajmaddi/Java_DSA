package MathsForDSA.Numbers;

public class GDC_LCM {
    public static void main(String[] args) {
        int a = 3;
        int b = 18;
        System.out.println("GCD: " + gcd(a, b));
        System.out.println("LCM: " + lcm(a, b));
    }

    static int gcd(int a, int b){
        if(a == 0){
            return b;
        }
        return gcd((b%a), a);
    }

    static int lcm(int a, int b){
        return a * b / gcd(a, b);
    }
}
