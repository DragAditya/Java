public class Overloading {

    public static void main(String[] args) {

        Overloading obj = new Overloading();
        System.out.println(obj.Add(10, 20));
        System.out.println(obj.Add(10, 20, 30));
        System.out.println(obj.Add(10.5, 20.5));
        System.out.println(obj.Add("Aditya ", "Wagh"));
    }

    public int Add(int x, int y) {
        return x + y;
    }

    public int Add(int x, int y, int z) {
        return x + y + z;
    }

    public double Add(double x, double y) {
        return x + y;
    }

    public String Add(String x, String y) {
        return x + y;
    }
}
