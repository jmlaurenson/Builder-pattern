public class App {
    public static void main(String[] args) throws Exception {
        Beverage myBeverage = new Beverage.Builder("large")
        .addCoffee(true)
        .addMilk("oat milk")
        .addSyrup("caramel syrup")
        .build();
        
        myBeverage.order();
    }
}
