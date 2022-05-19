package tables;//package tables;

import dbo.Student;

import java.sql.ResultSet;
import java.sql.SQLException;
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
try {
while (resultSet.next()){
   // resultSet.getString(1)
    }
   }catch (SQLException ex){
    ex.printStackTrace();
   }
 }
}