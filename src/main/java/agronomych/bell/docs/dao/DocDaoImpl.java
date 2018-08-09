package agronomych.bell.docs.dao;

import org.springframework.beans.factory.annotation.Autowired;
import agronomych.bell.docs.model.Doc;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

/**
 * @InheritDoc
 */
@Repository
public class DocDaoImpl implements DocDao {

    @Autowired
    private final EntityManagerFactory emf;

    public DocDaoImpl(EntityManagerFactory emf) {
        this.emf = emf;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Doc> all(){
        //TypedQuery<Doc> query = em.createQuery("SELECT h FROM Country h", Doc.class);
        //return query.getResultList();
        return new LinkedList<>();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Doc loadByCode(Integer code){
    //    return em.find(Doc.class, code);
        return new Doc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void save(Doc country){
        //em.persist(country);

    }
}
