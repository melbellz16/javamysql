package tables;//package tables;

import db.IDbExecutor;
import db.MySqlDbExecutor;
import dbo.Student;

import java.util.Locale;

//Создаем абстрактный класс
public abstract class TableAbs implements ITable<Student> {
    //реализуем интерфейс в родительском классе, так как все наши наследники должны иметь этот интерфейс
    // и должны наследоваться от этого класса
    //полиморфизм
      protected IDbExecutor dbExecutor = null; /// определяем поле, инициализируем его в null
    //Если будет несколько баз данных со своими реализаций,
    // надо определить конструктор, который определит тип базы данных
    public TableAbs(String dbType) {
        //toLowerCase(Locale.ROOT), пишем чтобы не был привязан к размеру и виду текста
        switch (dbType.toLowerCase(Locale.ROOT)){
            case "mysql":{
                dbExecutor = new MySqlDbExecutor(); //создаем объект для MySqldb
                break;
            }
        }
   }
}
