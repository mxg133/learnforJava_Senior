package my;

/**
 * @author 孟享广
 * @create 2020-06-09 11:07 上午
 */
public class SeasonTest {
    public static void main(String[] args) {
        Season spring = Season.SPRING;
        System.out.println(spring);

        Season[] values = Season.values();
        for (int i = 0; i < values.length; i++){
            System.out.println(values[i]);
            values[i].show();
        }

        Thread.State[] values1 = Thread.State.values();
        for (int i = 0; i < values1.length; i++){
            System.out.println(values1[i]);
        }


        Season wiNTER = Season.valueOf("WINTER");
        System.out.println(wiNTER);


        wiNTER.show();

    }
}
interface info{
    void show();
}
enum Season implements info{
    SPRING("春天", "春暖花开"){
        @Override
        public void show() {
            System.out.println("春天在哪里啊？？");
        }
    },
    SUMMER("夏天", "夏日炎炎"){
        @Override
        public void show() {
            System.out.println("宁夏");
        }
    },
    AUTUMN("秋天", "秋高气爽"){
        @Override
        public void show() {
            System.out.println("秋天回不来");
        }
    },
    WINTER("冬天", "冰天雪地"){
        @Override
        public void show() {
            System.out.println("大约在冬季");
        }
    };


    private final String m_SeasonName;
    private final String m_SeasonDesc;


    private Season(String m_SeasonName, String m_SeasonDesc){
        this.m_SeasonName = m_SeasonName;
        this.m_SeasonDesc = m_SeasonDesc;
    }


    public String getM_SeasonName() {
        return m_SeasonName;
    }

    public String getM_SeasonDesc() {
        return m_SeasonDesc;
    }

//    @Override
//    public String toString() {
//        return "Season{" +
//                "m_SeasonName='" + m_SeasonName + '\'' +
//                ", m_SeasonDesc='" + m_SeasonDesc + '\'' +
//                '}';
//    }


    @Override
    public void show() {
        System.out.println("季节");
    }
}
