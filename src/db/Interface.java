package db;

import java.sql.ResultSet;

public interface Interface {
    //Добавляем методы
    ResultSet execute(String sqlRequest);//Принимает в ()
    // модификатор package, потому что он нигде не будет реализовываться
    // метод close  определяем в интерфейс. Так как это общий метод и заносится в интерфейс
    void close();

}
