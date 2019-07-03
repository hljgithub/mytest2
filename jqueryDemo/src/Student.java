import java.io.Serializable;

/**
 * Created by HuoLiJun on 2018/5/24 0024.
 */
public class Student extends Person implements Serializable{


    private static final long serialVersionUID = 771652260758459933L;
    private  String name ;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public Student(String sex, String name, String age) {
        super(sex);
        this.name = name;
        this.age = age;
    }
}
