package lt.itakademija.electors.district;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Pavel on 2017-01-14.
 */
@Service
public class DistrictService {

    @Autowired
    DistrictRepository repository;

    public List getDistrictsList() {
        return repository.findAll();
    }

    public DistrictEntity save(DistrictEntity apylinke) {
        return repository.save(apylinke);
    }
}
