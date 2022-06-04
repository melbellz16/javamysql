package tables;

import dbo.Curator;

import java.util.List;
//Определяем интерфейс List
public interface ITable<T> {

 List<Curator> list();
}
