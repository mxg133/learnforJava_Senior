package my;

import java.util.Objects;

/**
 * @author 孟享广
 * @create 2020-06-10 10:00 上午
 */
public class Person {

    private String m_Name;
    private int m_Age;

    public Person() {
    }

    public Person(String m_Name, int m_Age) {
        this.m_Name = m_Name;
        this.m_Age = m_Age;
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

    @Override
    public String toString() {
        return "Person{" +
                "m_Name='" + m_Name + '\'' +
                ", m_Age=" + m_Age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return m_Age == person.m_Age &&
                Objects.equals(m_Name, person.m_Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(m_Name, m_Age);
    }
}
