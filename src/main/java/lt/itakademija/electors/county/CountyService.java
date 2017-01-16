package lt.itakademija.electors.county;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Pavel on 2017-01-12.
 */
@Service
public class CountyService {

    @Autowired
    CountyRepository repository;

    public List getAll() {
        return repository.findAll();
    }

    @Transactional
    public CountyEntity save(CountyEntity county) {
        return repository.save(county);
    }
}
