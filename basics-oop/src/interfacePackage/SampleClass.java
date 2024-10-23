package interfacePackage;

//all methods in interface class should implement in child class otherwise error will come
//child class should not be abstract class
 public class SampleClass implements InterfaceClass{
    public void demo2(int a){
        System.out.println("Demo2"+ " "+ a);
    }
    public void demo1(){
        System.out.println("Demo1"+" " +InterfaceClass.xyz);
    }




}
