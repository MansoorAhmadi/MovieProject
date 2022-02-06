package movies.repositories;

import movies.datamodel.Address;

import java.util.List;

public interface IRepository<T> {

    void create(T object);

    void update(T obj);

    void delete(T obj);

    List<Address> search (T obj);
}
