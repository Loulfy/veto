package Main.model.dao;

import java.util.List;

/**
 * Created by lcorbel on 04/02/16.
 */
public interface Dao<T>
{
    public Object find(int id);

    public void saveAllChanges(Object o);

    public List<Object> findAll();
}
