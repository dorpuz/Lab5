public class ProductTester {
    public static void main(String[] args) {

        Product[] products = new Product[4];
        products[0] = new Product("Masło",7.60);
        products[1] = new Product("Masło",7.60);
        products[2] = new Product("Mleko",2.60);
        products[3] = new Product("Jogurt",3.60);

        if (products[0].equals(products[2])){
            System.out.println("To ten sam!");
        } else{
            System.out.println("inny");
        }
    }
}
