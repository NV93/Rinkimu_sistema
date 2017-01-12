package lt.itakademija.electors.partija;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by Pavel on 2017-01-12.
 */
@Repository
public class PartijaRepository {

    @Autowired
    EntityManager em;

    public PartijaEntity save(PartijaEntity zal) {
        if (zal.getId() == null) {
            em.persist(zal);
        }
        em.merge(zal);
        return zal;


    }

    public List<PartijaEntity> findAll() {
        List list = em
                   .createQuery("SELECT p FROM PartijaEntity p")
                   .getResultList();
        return list;
    }
}
