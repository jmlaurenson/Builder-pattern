public class Beverage {
    private String size;
    private boolean coffee;
    private boolean tea;
    private String milk;
    private String syrup;


    public static class Builder {
    
        private String size;
        private boolean coffee = false;
        private boolean tea = false;
        private String milk = "no milk";
        private String syrup = "no syrup";
    
        
    
        public Builder(String size) {
            this.size = size;
        }
    
        public Builder addCoffee(boolean coffee) {
            this.coffee = coffee;
            return this;
        }
    
        public Builder addTea(Boolean tea) {
            this.tea = tea;
            return this;
        }
    
        public Builder addMilk(String milk) {
            this.milk = milk;
            return this;
        }

        public Builder addSyrup(String syrup) {
            this.syrup = syrup;
            return this;
        }
        
        public Beverage build(){
            return new Beverage(this);
        }

        
        
    }
    private Beverage(Builder builder) {
        this.size = builder.size;
        this.coffee = builder.coffee;
        this.tea = builder.tea;
        this.milk = builder.milk;
        this.syrup = builder.syrup;
        
    }

    public void order() {
        System.out.println("brewing a "+size+" beverage with "  + (coffee ? "coffee": "") + (tea ? "tea": "") +", " + milk + ", "+syrup);
    }
    
}
