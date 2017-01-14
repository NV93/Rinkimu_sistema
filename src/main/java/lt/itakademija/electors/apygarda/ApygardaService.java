package lt.itakademija.electors.apygarda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Pavel on 2017-01-12.
 */
@Service
public class ApygardaService {

    @Autowired
    ApygardaRepository repository;

    public List getApygardaList() {
        return repository.findAll();
    }

    @Transactional
    public ApygardaEntity save(ApygardaEntity apygarda) {
        return repository.save(apygarda);
    }
}
