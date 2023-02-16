public class Beverage {
    
    private String size;
    private boolean coffee;
    private boolean tea;
    private String milk;
    private boolean sugar;
    private String syrup;

    public Beverage(String size, boolean coffee, boolean tea, String milk){
        this.size = size;
        this.coffee = coffee;
        this.tea = tea;
        this.milk = milk;
    }

    public Beverage(String size, boolean coffee, boolean tea){
        this.size = size;
        this.coffee = coffee;
        this.tea = tea;
    }

    public String order() {
        return "brewing a "+size+" beverage with "  + (coffee ? "coffee": "") + (tea ? "tea": "") +", " + milk;
    }
}
