
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 测试List内部排序
 * Created by HuoLiJun on 2018/5/21 0021.
 */
public class TestJava {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("男", "张飞", "25"));
        studentList.add(new Student("女", "孙尚香", "22"));
        studentList.add(new Student("男", "诸葛亮", "23"));
        studentList.add(new Student("男", "荆轲", "35"));
        studentList.add(new Student("女", "王菲", "45"));
        studentList.add(new Student("女", "林心如", "35"));
        studentList.add(new Student("男", "周杰伦", "26"));

        System.out.println("排序之前的studentList：" + studentList.toString());
        for (Student student : studentList) {
            System.out.println(student.toString());
        }
        System.out.println("----------------------------------");

        List<Student> studentList1 = sortStudentList(studentList);
        for (Student student : studentList1) {
            System.out.println(student.toString());
        }



        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        list.add("孙琦");
        list.add("活力军");
        list.add("刘备");
        list.add("位于红");
        list.add("胸前前");
        System.out.println("排序之前："+list.toString());
        Collections.sort(list);
        System.out.println("排序之后："+list.toString());



    }


    /***
     * 排序
     * @param studenList
     * @return
     */
    public static List<Student> sortStudentList(List<Student> studenList) {
        Collections.sort(studenList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge().compareTo(o2.getAge());
            }
        });

        return studenList;
    }
}
