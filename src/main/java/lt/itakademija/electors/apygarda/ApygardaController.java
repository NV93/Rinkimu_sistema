package lt.itakademija.electors.apygarda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Pavel on 2017-01-14.
 */
@RestController
public class ApygardaController {

    @Autowired
    ApygardaService service;

    @GetMapping("/apygarda")
    public List getApygardaList(){
        return service.getApygardaList();
    }

    @PostMapping("/apygarda")
    public ApygardaEntity save(@RequestBody ApygardaEntity apygarda){
        return service.save(apygarda);
    }



}
