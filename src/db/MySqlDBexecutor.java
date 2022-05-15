package db;

import utils.recources.IReadProperty;
import utils.recources.ReadPropertiesFromPropsFile;

import java.sql.*;
import java.util.Properties;

public class MySqlDBexecutor implements Interface {
    //Используем static, чтобы избежать лишних подключений в базе данных
    private static Connection connect = null;
    //Чтобы не сгенерировать много statement мы должны сгенерировать static
    private static Statement statement = null;

    // статическое поле одно и оно не будет привязано к большому кол-ву объектов



    @Override //переопределение метода
    public ResultSet execute(String sqlRequest) {

        IReadProperty<Properties> readerProps = new ReadPropertiesFromPropsFile();
        Properties properties = readerProps.read();

        ResultSet resultSet = null;

        //переопределяем  connector
        //Connection connect = null;

        try {
             connect = DriverManager.getConnection(
                    properties.getProperty("url") + "/" + properties.getProperty("db_name"),
                    properties.getProperty("username"),
                    properties.getProperty("password")
            );

             statement = connect.createStatement();
             resultSet = statement.executeQuery(sqlRequest);


        }catch (SQLException ex){
            ex.printStackTrace();
           //return null;

        //} finally {
            //try {
             //  assert connect != null: "Connect is null";
             //  connect. close();
             //  statement.close();
           // } catch (SQLException e) {
              // e.printStackTrace();
           //    return null;
            //}
        }
        return resultSet;
    }

    @Override
    public void close() {
        try {
            connect.close();
            statement.close();
        } catch (SQLException ex){
            ex.printStackTrace();
        }

    }
}
