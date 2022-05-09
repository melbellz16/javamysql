package dbo;

public class TaskGroup extends DboAbstact {
    private String tableName = "TaskGroup"; //помечаем принадлежность к таблице TaskGroup
//определяем конструктор
    public TaskGroup(int id, String name, int id_curator){
        //передаем наше имя таблицы для того чтобы родительский класс вызвал конструктор в наследниках(чтобы был параметр)
 super("TaskGroup");

 this.id = id;
 this.name = name;
 this.id_curator = id_curator;
    }
    private int id;
    private String name;
    private int id_curator;
}
