public class Instruction {
    public String action;
    public int truck;
    public int x;
    public int y;
    public Product[] products;
    public int store;

    public Instruction(String action, int truck, int x, int y) {
        this.action = action;
        this.truck = truck;
        this.x = x;
        this.y = y;
    }

    public Instruction(String action, int truck, Product[] products) {
        this.action = action;
        this. truck = truck;
        this.products = products;
    }

    public Instruction(String action, int truck, int store, Product[] products) {
        this.action = action;
        this. truck = truck;
        this.store = store;
        this.products = products;
    }
}
