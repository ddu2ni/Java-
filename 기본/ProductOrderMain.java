package class1;

class ProductOrder{
    String productName;
    int price;
    int quantity;
}

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] products = new ProductOrder[3];


        ProductOrder product1 = new ProductOrder(); //배열 선언뒤에는 각 요소 초기화 필수!
        product1.productName = "두부";
        product1.price = 2000;
        product1.quantity = 2;
        products[0] = product1;

        ProductOrder product2 = new ProductOrder();
        product2.productName = "김치";
        product2.price = 5000;
        product2.quantity = 1;
        products[1] = product2;

        ProductOrder product3 = new ProductOrder();
        product3.productName = "콜라";
        product3.price = 1500;
        product3.quantity = 2;
        products[2] = product3;

        int sum = 0;
        for (ProductOrder product : products) {
            System.out.println("상품명: " + product.productName + ", 가격: " + product.price + ", 수량: " + product.quantity);
            sum += product.price * product.quantity;
        }
        System.out.println("총 결제금액: " + sum);
    }
}
