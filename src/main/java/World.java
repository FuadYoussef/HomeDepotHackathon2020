public class World {
    public Truck[] trucks;
    public Store[] stores;
    public Warehouse warehouse;
    public Product[] products;
    public World(Truck[] trucks, Store[] stores, Warehouse warehouse, Product[] products) {
        this.trucks = trucks;
        this.stores = stores;
        this.warehouse = warehouse;
        this.products = products;
    }
}
