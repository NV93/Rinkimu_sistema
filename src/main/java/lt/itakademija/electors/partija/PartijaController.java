package lt.itakademija.electors.partija;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Pavel on 2017-01-12.
 */
@RestController
public class PartijaController {

    @Autowired
    PartijaService service;

    @PostMapping("/partija")
    public PartijaEntity save(@RequestBody PartijaEntity partija){
        return service.save(partija);
    }

    @GetMapping("/partija")
    public List<PartjiaReport> getPartijaList(){
        return service.getPartjaList();
    }
}
