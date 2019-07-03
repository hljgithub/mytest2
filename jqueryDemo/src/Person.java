/**
 * Created by HuoLiJun on 2018/6/1 0001.
 */
public class Person {
    private String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "sex='" + sex + '\'' +
                '}';
    }

    public Person(String sex) {
        this.sex = sex;
    }
}
