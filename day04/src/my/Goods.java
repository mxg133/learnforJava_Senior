package my;

/**
 * @author 孟享广
 * @create 2020-06-08 4:55 下午
 */
public class Goods implements Comparable{
    private String m_Name;
    private double m_Price;

    public Goods() {
    }

    public Goods(String m_Name, double m_Price) {
        this.m_Name = m_Name;
        this.m_Price = m_Price;
    }

    public String getM_Name() {
        return m_Name;
    }

    public void setM_Name(String m_Name) {
        this.m_Name = m_Name;
    }

    public double getM_Price() {
        return m_Price;
    }

    public void setM_Price(double m_Price) {
        this.m_Price = m_Price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "m_Name='" + m_Name + '\'' +
                ", m_Price=" + m_Price +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Goods){
            Goods goods = (Goods)o;

            if (this.m_Price > goods.m_Price){
                return 1;
            }else if (this.m_Price < goods.m_Price){
                return -1;
            }else {
//                return 0;
                return this.m_Name.compareTo(goods.m_Name);
            }
        }
        throw new RuntimeException("传入的类型不一致");
    }
}
