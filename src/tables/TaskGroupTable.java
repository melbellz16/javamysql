package tables;

import dbo.Curator;

import java.util.List;

public class TaskGroupTable extends TableAbs {// дописать  эту таблицу

    public TaskGroupTable(String dbType) {
        super(dbType);
    }

    @Override
    public List<Curator> list() {
        return null;
    }
}
