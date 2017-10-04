/**
 * Created by Наталья on 03.10.2017.
 */
public class Methods {
    public static void main(String[] args) {
        printHello();
    }

    int sign(int x){
        if (x == 0 ) return 0;
        return (x>0) ? 1 : -1;
    }

    /*double max(double a, double b){
        double result = (a > b) ? a : b;
        if (a>b){
            return a;
        } else {
            return b;
        }
        return result;
    }*/

    float arrayMax(float[] arr){
        return 0;
    }

    static void printHello(){
        System.out.println(Math.sqrt(3.0));
        Math.pow(2, 1.0/3.0);
        System.out.println("Hello!");
    }


}
