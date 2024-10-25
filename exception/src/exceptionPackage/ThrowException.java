package exceptionPackage;

public class ThrowException {
    public static void demoThrow(int a){
        if(a==10){
            throw new ArithmeticException("Ans is " + a);

        }
        else if(a==20){
            throw new ArithmeticException("Ans is " + a);
        }
    }

    public static void main(String[] args) {

        try{
            ThrowException.demoThrow(10);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
