package my;

/**
 * @author 孟享广
 * @create 2020-06-11 9:17 上午
 */
public class Employee implements Comparable{

    private String m_Name;
    private int m_Age;
    private MyDate m_Birthday;

    public Employee() {
    }

    public Employee(String m_Name, int m_Age, MyDate m_Birthday) {
        this.m_Name = m_Name;
        this.m_Age = m_Age;
        this.m_Birthday = m_Birthday;
    }

    public String getM_Name() {
        return m_Name;
    }

    public void setM_Name(String m_Name) {
        this.m_Name = m_Name;
    }

    public int getM_Age() {
        return m_Age;
    }

    public void setM_Age(int m_Age) {
        this.m_Age = m_Age;
    }

    public MyDate getM_Birthday() {
        return m_Birthday;
    }

    public void setM_Birthday(MyDate m_Birthday) {
        this.m_Birthday = m_Birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "m_Name='" + m_Name + '\'' +
                ", m_Age=" + m_Age +
                ", m_Birthday=" + m_Birthday +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Employee){
            Employee e = (Employee)o;
            return this.m_Name.compareTo(e.m_Name);
        }
        throw new RuntimeException("垃圾数据");
    }
}
