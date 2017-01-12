package lt.itakademija.electors.partija;

import lt.itakademija.electors.kandidatas.KandidatasEntity;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Pavel on 2017-01-12.
 */
public class PartijaEntityTest {

    @Autowired
    PartijaService service;

    @Test
    public void testCreatePartija(){
        PartijaEntity zal = new PartijaEntity();
        zal.setPavadinimas("Zalieji");
        List<KandidatasEntity> zalNariai = new ArrayList();
        KandidatasEntity skvernelis = new KandidatasEntity();
        skvernelis.setVardas("Saulius");
        skvernelis.setPavarde("Skvernelis");
        skvernelis.setGimimoData(new Date());
        skvernelis.setAprasymas("Negeriu, beveik");
        System.out.println(zal);
        zalNariai.add(skvernelis);
        zal.setNariai(zalNariai);
        service.save(zal);


    }

}