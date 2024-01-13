package practice;

public class Swapping_variable {
    public static void main(String[] args) {
        int a=1,b=2;

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.printf("After Swapping a and b is :"+a+" "+b);
    }
}
