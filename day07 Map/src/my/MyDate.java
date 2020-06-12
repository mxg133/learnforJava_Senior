package my;

/**
 * @author 孟享广
 * @create 2020-06-11 9:15 上午
 */
public class MyDate implements Comparable{

    private int m_Year;
    private int m_Mouth;
    private int m_Day;

    public MyDate() {
    }

    public MyDate(int m_Year, int m_Mouth, int m_Day) {
        this.m_Year = m_Year;
        this.m_Mouth = m_Mouth;
        this.m_Day = m_Day;
    }

    public int getM_Year() {
        return m_Year;
    }

    public void setM_Year(int m_Year) {
        this.m_Year = m_Year;
    }

    public int getM_Mouth() {
        return m_Mouth;
    }

    public void setM_Mouth(int m_Mouth) {
        this.m_Mouth = m_Mouth;
    }

    public int getM_Day() {
        return m_Day;
    }

    public void setM_Day(int m_Day) {
        this.m_Day = m_Day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "m_Year=" + m_Year +
                ", m_Mouth=" + m_Mouth +
                ", m_Day=" + m_Day +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof MyDate){
            MyDate m = (MyDate)o;

        }
        throw new RuntimeException("垃圾！");
    }
}
