package utils.recources;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

//реализуем интерфейс и тип того метода, что в интерфейсе
public class ReadPropertiesFromPropsFile implements IReadProperty<Properties> {
    @Override
    //будет возвращать разные типы объектов
    public Properties read(){
        String adminFolder = System.getProperty("user.dir");

        try (InputStream input = new FileInputStream(
                String.format("%s/src/resources/%s", adminFolder,"jdbc.properties")
        )) {
            Properties prop = new Properties();

            prop.load(input);


            return prop;
        } catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }
}
