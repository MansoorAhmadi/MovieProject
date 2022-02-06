package movies.services;

import movies.datamodel.Address;
import movies.repositories.ContactRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service("ContactDAO")
public class ContactService extends ContactRepository {

    @Inject
    SessionFactory factory;

    @Override
    public void create(T object){
        Session session = factory.openSession();
        session.save(object);
        session.close();
    }

    @Override
    public void update(T obj){
        Session session = factory.openSession();
        session.update(obj);
        session.close();
    }

    @Override
    public void delete(T obj){
        Session session = factory.openSession();
        session.delete(obj);
        session.close();
    }

    @Override
    public List<Address> search(T obj) {
        Session session = factory.openSession();
        Query<Address> query = session.createQuery("from Address where ID =?", Address.class);
        List<Address> list = query.list();
        session.close();

        return list;
    }
}
