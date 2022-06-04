import dbo.Curator;
import dbo.Student;
import tables.CuratorTable;
import tables.StudentTable;

import java.util.List;

public class Main {
    public static void main(String...args){
        List<Student> students = new StudentTable("mysql").list();
        List<Curator> curators = new CuratorTable("mysql").list(); // не уверена спросить
//вывести на экран ко-во студентов
        for(Student student: students) {
            System.out.println(student.getFio());
        }

    }
}
