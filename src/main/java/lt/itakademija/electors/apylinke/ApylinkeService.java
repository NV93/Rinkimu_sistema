package lt.itakademija.electors.apylinke;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Pavel on 2017-01-14.
 */
@Service
public class ApylinkeService {

    @Autowired
    ApylinkeRepository repository;

    public List getApylinkeList() {
        return repository.findAll();
    }

    public ApylinkeEntity save(ApylinkeEntity apylinke) {
        return repository.save(apylinke);
    }
}
