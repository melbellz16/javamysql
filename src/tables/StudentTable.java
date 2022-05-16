package tables;

import dbo.Student;

import java.util.List;

//Реализуем интерфейс
public class StudentTable implements iTable<Student> {//  в таблицу Student передаем объект Student
//Реализуем интерфейс
    @Override
    public List<Student> list() {
        return null;
    }
}
