package tables;//package tables;

import dbo.Student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//Реализуем интерфейс
public class StudentTable extends TableAbs { //  в таблицу Student передаем объект Student
    // реализуем интерфейс в нашем родителе TableABs
private Student student;

public StudentTable(String dbType){
    super(dbType);

}


//Реализуем интерфейс
   @Override
    public List<Student> list() {
       ResultSet resultSet = this.dbExecutor.execute(String.format(" select *from %s", Student.tableName));

       List<Student> students = new ArrayList<>();
       //Определяем реализацию,как Лист, так как мы просто будем его добавлять и последовательно читать

try {
while (resultSet.next()){
    students.add(new Student( //создаем обьект студента и инициализируем
            resultSet.getInt(1),
            resultSet.getInt(4),
            resultSet.getString(2),
            resultSet.getString(3)
    ));

    }
   }catch (SQLException ex){
    ex.printStackTrace();
   }
 }
}