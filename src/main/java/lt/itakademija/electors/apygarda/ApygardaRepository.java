package lt.itakademija.electors.apygarda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

/**
 * Created by Pavel on 2017-01-12.
 */
@Repository
public class ApygardaRepository {

    @Autowired
    EntityManager em;
}
