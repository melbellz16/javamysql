package dbo;

public class Curator {

    public final static String tableName = "Curator";
    //private String tableName = "Curator"; //помечаем принадлежность к таблице Curator
    public Curator(int id, String fio){

        this.id = id;
        this.fio = fio;
    }
    //определяем поля
    private int id;
    private String fio;

    public int getId() {
        return this.id;
    }

    public String getFio() {
        return this.fio;
    }
}
