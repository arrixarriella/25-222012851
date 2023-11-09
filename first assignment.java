interface E// this is the interface
{
  public void kitchen();
}

class A extends B implements E //classA extend class B and implement E
 {
  public void house(){
    System.out.println("pome");
  }
  public void kitchen(){
    System.out.println("white");

  }
}
class B extends C //Class B extend class C
{
  public void room(){
    System.out.println("green");
  }
}
class C extends D //Class C extend class D
{
public void salon(){
    System.out.println("red");
  }
}
class D
 {
  public void door(){
    System.out.println("black");
  }
}
public class inheritance1 
{
  public static void main(String [] args){
    //object main
  A objt=new A();
  //method calling
  objt.kitchen();
  objt.house();
  objt.room();
  objt.salon();
  }//end of main method
}//end of class