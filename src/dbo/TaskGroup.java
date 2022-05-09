package dbo;

public class TaskGroup extends DboAbstact {
    private String tableName = "TaskGroup"; //помечаем принадлежность к таблице TaskGroup
//определяем конструктор
    public TaskGroup(){
        //передаем наше имя таблицы для того чтобы родительский класс вызвал конструктор в наследниках(чтобы был параметр)
super("TaskGroup");
    }
}
