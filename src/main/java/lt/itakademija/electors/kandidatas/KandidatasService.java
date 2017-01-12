package lt.itakademija.electors.kandidatas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pavel on 2017-01-12.
 */
@Service
public class KandidatasService {

    @Autowired
    KandidatasRepository repository;

    @Transactional
    public KandidatasEntity save(KandidatasEntity kandidatasEntity) {
        return repository.save(kandidatasEntity);
    }

    public List<KandidatasReport> getKandidatasList() {
        List<KandidatasReport> list = new ArrayList<>();
        for (KandidatasEntity kandidatasEntity : repository.getKandidatasList()) {
            KandidatasReport kr = new KandidatasReport();
            kr.setId(kandidatasEntity.getId());
            kr.setVardas(kandidatasEntity.getVardas());
            kr.setPavarde(kandidatasEntity.getPavarde());
            kr.setAprasymas(kandidatasEntity.getAprasymas());
            kr.setGimimoData(kandidatasEntity.getGimimoData());
            kr.setPartijosId(kandidatasEntity.getPartinePriklausomybe().getId());
            kr.setPartijosPavadinimas(kandidatasEntity.getPartinePriklausomybe().getPavadinimas());
            list.add(kr);
        }
        return list;
    }
}
