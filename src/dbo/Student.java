package dbo;

public class Student<privat> extends DboAbstact {
    //private String tableName = "Student"; //помечаем принадлежность к таблице Student
public Student (int id, int idGroup, String fio, String sex) {
    super("Student");

    this. id = id;//  инициализируем всегда после создания метода, так как конструктор должен сначала инициализировать поля родителя
    this.idGroup = idGroup; //this. это ссылка на текущей объект
    this.fio = fio;
    this.sex = sex;
}
//Определяем поля
private String fio;
private String sex;
private int id;
private int idGroup;
//Определяем данные через конструктор (инициализируем(записываем) поля) в Public Student ()-
    //5 строка до этого была просто Public Student ()
    //После этого инициализируем наши поля (строка 8-11)
//Инициализируем Getter, Setter

    public String getFio() {
        return this.fio;
    }

    public String getSex() {
        return this.sex;
    }

    public int getId() {
        return this.id;
    }

    public int getIdGroup() {
        return this.idGroup;
    }
}
