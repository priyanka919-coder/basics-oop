package exceptionPackage;

public class FinallClass {
    public static void main(String[] args) {
        try{
            System.out.println("Inside try block first line");
            int a=10, res=5;
            res=res/10;
            System.out.println(res);

        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Hi I am in Final Block");
        }
    }
}

