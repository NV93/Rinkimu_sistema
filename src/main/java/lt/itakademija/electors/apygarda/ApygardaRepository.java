package lt.itakademija.electors.apygarda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by Pavel on 2017-01-12.
 */
@Repository
public class ApygardaRepository {

    @Autowired
    EntityManager em;

    public List findAll() {
        List list = em
                .createQuery("SELECT a FROM ApygardaEntity a")
                .getResultList();
        return list;
    }

    public ApygardaEntity save(ApygardaEntity apygarda) {
        if (apygarda.getId() == null) {
            em.persist(apygarda);
        }
        em.merge(apygarda);
        return apygarda;
    }
}
