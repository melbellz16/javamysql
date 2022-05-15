package dbo;

public class TaskGroup extends DboAbstact {
    private String tableName = "TaskGroup"; //помечаем принадлежность к таблице TaskGroup
//определяем конструктор
    public TaskGroup(int id, String name, int idCurator){
        //передаем наше имя таблицы для того чтобы родительский класс вызвал конструктор в наследниках(чтобы был параметр)
 super("TaskGroup");

 this.id = id;
 this.name = name;
 this.idCurator = idCurator;
    }
    private int id;
    private String name;
    private int idCurator;

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getIdCurator() {
        return this.idCurator;
    }
}
