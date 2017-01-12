package lt.itakademija.electors.partija;

import lt.itakademija.electors.kandidatas.KandidatasEntity;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by Pavel on 2017-01-12.
 */
public class PartjiaReport {

    private Long id;

    private String pavadinimas;

    private List<Long> nariai;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public List<Long> getNariai() {
        return nariai;
    }

    public void setNariai(List<Long> nariai) {
        this.nariai = nariai;
    }
}
