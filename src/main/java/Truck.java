import java.util.ArrayList;

public class Truck {
    public int id;
    public int x;
    public int y;
    public float capacity;
    public int availCap;
    public int range;
    public ArrayList<Product> products;
    public Truck(int id, int x, int y, float capacity, int range) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.capacity = capacity;
        this.availCap = (int)capacity;
        this.range = range;
        this.products = new ArrayList<>();
    }

    public Instruction move(String action, int truck, int nx, int ny) {
        int dist = Math.abs(nx) + Math.abs(ny);
        if (dist <= range) {
            range = dist;
            x = nx;
            y = ny;
            return new Instruction(action, truck, nx, ny);
        } else {
            return  null;
        }
    }

    public Instruction load(String action, int truck, Product[] products) {
        ArrayList<Product> loadedProducts = new ArrayList<>();
        for (int i = 0; i < products.length; i++) {
            if (availCap - products[i].weight >= 0) {
                this.products.add(products[i]);
                loadedProducts.add(products[i]);
                availCap-= products[i].weight;
            }
        }
        return new Instruction(action, truck, (Product[])loadedProducts.toArray());
    }

    public Instruction unload(String action, int truck, Store store, Product[] products) {
        ArrayList<Product> unloadedProducts = new ArrayList<>();
        for (int i = 0; i < products.length; i++) {
            if (store.availCap - products[i].weight >= 0) {
                this.products.add(products[i]);
               unloadedProducts.add(products[i]);
                availCap-= products[i].weight;
            }
        }
        return new Instruction(action, truck, store.id, (Product[])unloadedProducts.toArray());
    }


}
