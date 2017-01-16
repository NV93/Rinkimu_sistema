package lt.itakademija.electors.county;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by Pavel on 2017-01-12.
 */
@Repository
public class CountyRepository {

    @Autowired
    EntityManager em;

    public List findAll() {
        List list = em
                .createQuery("SELECT a FROM CountyEntity a")
                .getResultList();
        return list;
    }

    public CountyEntity save(CountyEntity apygarda) {
        if (apygarda.getId() == null) {
            em.persist(apygarda);
        }
        em.merge(apygarda);
        return apygarda;
    }
}
