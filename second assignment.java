interface E//interface
{
  public void world();
}

class A extends B implements E//class Aextend B implements
 {
  public void continent()
  {
    System.out.println("africa");
  }
  public void country()
  {
    System.out.println("rwanda");

  }
  public void world()
  {
System.out.println("earth");
}
}

class B extends C// class B extends C
 {
  public void province()
  {
    System.out.println("northern");
  }
}
class C extends D
 {
  public void district()
  {
    System.out.println("gasabo");
  }
}
class D
 {
  public void sector()
  {
    System.out.println("nyamirambo");
  }
}
public class inheritance2 
{
  public static void main(String [] args)
  {
  A objt=new A();//oject main
//calling method
  objt.continent();
  objt.country();
  objt.world();
  objt.province();
  objt.district();
  objt.sector();
  }
}// end of Class