package lt.itakademija.electors.apygarda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Pavel on 2017-01-12.
 */
@Service
public class ApygardaService {

    @Autowired
    ApygardaRepository repository;
}
