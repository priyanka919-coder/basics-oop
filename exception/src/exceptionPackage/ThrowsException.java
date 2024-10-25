package exceptionPackage;

public class ThrowsException {

    public static void demo(int a) throws InterruptedException,IllegalAccessException {

          if(a==10){
              throw new ArithmeticException("I am Arithmetic Exception");
          }
          else if(a==20){
              throw new InterruptedException(" I am Interrupted Exception");
          }
          else if(a==30){
              throw new IllegalAccessException(" I am IllegalAccess Exception");
          }
          else {
              throw new NullPointerException(" I am NullPointerException Exception");
          }



    }

    public static void main(String[] args) {
        try{
            ThrowsException.demo(100);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }


}
