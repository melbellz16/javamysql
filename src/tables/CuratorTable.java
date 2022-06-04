package tables;

import dbo.Curator;
import dbo.Student;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CuratorTable extends TableAbs {
    // в таблицу CuratorTable передаем объект Type реализуем интерфейс в нашем родителе TableABs
    private Field type;
// вызываем конструктор из родительского класса
    public CuratorTable(String dbType) {
        super(dbType);

    }

    @Override
    public List<Curator> list() {
        ResultSet resultSet = this.dbExecutor.execute(String.format(" select *from %s", Curator.tableName));

        List<Curator> curators = new ArrayList<>();
        //Определяем реализацию,как Лист, так как мы просто будем его добавлять и последовательно читать
        try {
            while (resultSet.next()){
                curators.add(new Curator( //создаем обьект студента и инициализируем
                        resultSet.getInt(1),
                        resultSet.getString(3)
                ));

            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }finally { //закрываем коннект

            this.dbExecutor.close();
        }
        return curators;
    }
    }
