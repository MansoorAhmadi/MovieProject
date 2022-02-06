package movies.repositories;

import movies.datamodel.Contact;

import java.util.List;

public interface MovieRepository {
    void create(T object);

    void update(T obj);

    void delete(T obj);

    List<Contact> search (T obj);

}
