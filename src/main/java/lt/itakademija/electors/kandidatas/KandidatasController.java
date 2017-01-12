package lt.itakademija.electors.kandidatas;

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
public class KandidatasController {

    @Autowired
    KandidatasService service;

    @PostMapping("/kandidatas")
    public KandidatasEntity save(@RequestBody KandidatasEntity kandidatasEntity){
        return service.save(kandidatasEntity);
    }

    @GetMapping("/kandidatas")
    public List<KandidatasReport> getKandidatasList(){
        return service.getKandidatasList();
    }

}
