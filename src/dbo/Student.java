package dbo;

public class Student<privat> extends DboAbstact {
    //private String tableName = "Student"; //помечаем принадлежность к таблице Student
public Student (int id, int id_group, String fio, String sex) {
    super("Student");

    this. id = id;//  инициализируем всегда после создания метода, так как конструктор должен сначала инициализировать поля родителя
    this.id_group =id_group; //this. это ссылка на текущей объект
    this.fio = fio;
    this.sex = sex;
}
//Определяем поля
private String fio;
private String sex;
private int id;
private int id_group;
//Определяем данные через конструктор (инициализируем(записываем) поля) в Public Student ()-
    //5 строка до этого была просто Public Student ()
    //После этого инициализируем наши поля (строка 8)

}
