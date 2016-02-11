package Main.model.dao;

/**
 * Created by lcorbel on 04/02/16.
 */
public interface Dao<T>
{
    public T find(int id);

    public T saveAllChanges(T o);
}
