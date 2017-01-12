package lt.itakademija.electors.kandidatas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by Pavel on 2017-01-12.
 */
@Repository
public class KandidatasRepository {

    @Autowired
    EntityManager em;

    public KandidatasEntity save(KandidatasEntity kandidatasEntity) {
        if (kandidatasEntity.getId() == null) {
            em.persist(kandidatasEntity);
        }
        em.merge(kandidatasEntity);
        return kandidatasEntity;
    }

    public List<KandidatasEntity> getKandidatasList() {
        List list = em
                .createQuery("SELECT p FROM KandidatasEntity p")
                .getResultList();
        return list;
    }
}
