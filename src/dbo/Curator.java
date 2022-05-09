package dbo;

public class Curator extends DboAbstact{
    //private String tableName = "Curator"; //помечаем принадлежность к таблице Curator
    public Curator(int id, String fio){
        super("Curator");

        this.id = id;
        this.fio = fio;
    }
    private int id;
    private String fio;
}
