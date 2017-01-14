package lt.itakademija.electors.apylinke;

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
public class ApylinkeController {

    @Autowired
    ApylinkeService service;

    @GetMapping("/apylinke")
    public List getApylinkeList(){
        return service.getApylinkeList();
    }

    @PostMapping("/apylinke")
    public ApylinkeEntity save(@RequestBody ApylinkeEntity apylinke){
        return service.save(apylinke);
    }
}
