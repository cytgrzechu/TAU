package pl.edu.pjwstk;

public class Lab3 {

    public double addition(double a, double b){

        return a+b;
    }

    public double multiplication(double a, double b){
        return a*b;
    }
    public double subtraction(double a, double b){
        return a-b;
    }

    public double square(int a){
        if(a == 0 ){
            throw new IllegalArgumentException();
        }
        return a*a;
    }

    public double division(double a, double b){
        if(a == 0 && b == 0 ){
            throw new IllegalArgumentException();
        }
        return a/b;
    }

    public int mod(int a, int b){
        if(a == 0 && b == 0 ){
            throw new IllegalArgumentException();
        }
        return a%b;
    }

    public Boolean greaterThan(int a, int b) {
        if(a > b){
            return true;
        }else if(b > a) {
            return false;
        }
        return null;
    }

    public Boolean lessThan(double a, double b) {
        if(a < b){
            return true;
        }else if(b < a) {
            return false;
        }
        return null;
    }
}
