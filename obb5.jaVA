public class object {
    public double ci(double p,double r,double t,double n){
        return p* (Math.pow((1+r/1200), n*t));
    }
}
     class ob5 {
    public static void main(String[] args) {
        object myObject= new object();
        double result=myObject.ci(500000, 18, 3, 12);
        System.out.println("The result is: "+result);
    }
}
