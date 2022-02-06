package movies.repositories;

import movies.datamodel.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
    void create(T object);

    void update(T obj);

    void delete(T obj);

    List<Contact> search (T obj);

}
