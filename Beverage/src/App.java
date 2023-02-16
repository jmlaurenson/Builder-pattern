public class App {
    public static void main(String[] args) throws Exception {
        Beverage myBeverage = new Beverage("large", false, true, "oat milk");
        System.out.println(myBeverage.order());
    }
}
