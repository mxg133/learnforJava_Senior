package my;

/**
 * @author 孟享广
 * @create 2020-06-12 12:02 下午
 */
public class Order<T> {
    String ordername;
    int orderID;

    T orderT;

    public Order() {
    }

    public Order(String ordername, int orderID, T orderT) {
        this.ordername = ordername;
        this.orderID = orderID;
        this.orderT = orderT;
    }

    public String getOrdername() {
        return ordername;
    }

    public void setOrdername(String ordername) {
        this.ordername = ordername;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public T getOrderT() {
        return orderT;
    }

    public void setOrderT(T orderT) {
        this.orderT = orderT;
    }

    @Override
    public String toString() {
        return "Order{" +
                "ordername='" + ordername + '\'' +
                ", orderID=" + orderID +
                ", orderT=" + orderT +
                '}';
    }
}
