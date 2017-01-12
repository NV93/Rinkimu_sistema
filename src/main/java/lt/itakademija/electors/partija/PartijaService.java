package lt.itakademija.electors.partija;

import lt.itakademija.electors.kandidatas.KandidatasEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

/**
 * Created by Pavel on 2017-01-12.
 */
@Service
public class PartijaService {

    @Autowired
    PartijaRepository repository;

    @Transactional
    public PartijaEntity save(PartijaEntity zal) {
        return repository.save(zal);
    }

    public List<PartjiaReport> getPartjaList() {
        List<PartjiaReport> list = new ArrayList<>();
        for (PartijaEntity partija : repository.findAll()) {
            PartjiaReport report = new PartjiaReport();
            report.setId(partija.getId());
            report.setPavadinimas(partija.getPavadinimas());
            List<Long> narysIdList = new ArrayList<>();
            partija.getNariai().forEach(narys -> narysIdList.add(narys.getId()));
            report.setNariai(narysIdList);
            list.add(report);
        }
        return list;
    }
}
