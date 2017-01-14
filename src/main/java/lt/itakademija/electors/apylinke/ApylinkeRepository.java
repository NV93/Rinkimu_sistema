package lt.itakademija.electors.apylinke;

import lt.itakademija.electors.apygarda.ApygardaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by Pavel on 2017-01-14.
 */
@Repository
public class ApylinkeRepository {

    @Autowired
    EntityManager em;

    public List<ApygardaEntity> findAll() {
        List list = em
                .createQuery("SELECT a FROM ApylinkeEntity a")
                .getResultList();
        return list;
    }


    public ApylinkeEntity save(ApylinkeEntity apylinke) {
        if (apylinke.getId() == null) {
            em.persist(apylinke);
        }
        em.merge(apylinke);
        return apylinke;
    }
}
