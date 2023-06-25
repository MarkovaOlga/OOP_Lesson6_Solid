package solid.lsp;

public class FactoryOrder {

//    private int count = 0;
//
//    // Каждый 3-й заказ - бонусный
//    public Order create(int qnt, int price) {
//        count++;
//        if (count == 3){
//            count = 0;
//            return new OrderBonus(qnt, price);
//        }
//        return new Order(qnt, price);
    public OrderAbstract create(int price, int qnt, boolean isBonus) {
        if (isBonus) {
            return new OrderBonus(price, qnt);
        }
        return new Order(price, qnt);

    }
}
