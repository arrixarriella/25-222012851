 class object {
    public double si(double p,double r,double t){
        return p*r*t;
    }
}
    public class ob4 {
    public static void main(String[] args) {
        object myObject= new object();
        double result;
        result=myObject.si(100000, 0.05, 5);
        System.out.println("The result is: "+result);
    }
}
