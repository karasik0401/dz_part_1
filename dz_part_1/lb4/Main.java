
public class Main {
    public static void main(String[] args) {
        Products firstProduct = new Products("Сок", "04.12.2021", 50);
        System.out.print("Товар: " + firstProduct.getName() + "\nДата: " + firstProduct.getDate() + "\nЦена: " + firstProduct.checkPrice() + " руб.");
    }
}