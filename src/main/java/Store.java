public class Store {
    public int id;
    public int x;
    public int y;
    public int capacity;
    public int availCap;
    public Product[] products;
    public Product[] demand;
    public Store(int id, int x, int y, int capacity, Product[] products, Product[] demand) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.capacity = capacity;
        this.availCap = capacity;
        this.products = products;
        this.demand = demand;
    }
}
