package lt.itakademija.electors.partija;

import lt.itakademija.electors.kandidatas.KandidatasEntity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Pavel on 2017-01-12.
 */
@Entity
public class PartijaEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "PARTIJA_ID")
    private Long id;

    private String pavadinimas;

    @OneToMany(mappedBy="partinePriklausomybe", cascade = CascadeType.ALL)
    private List<KandidatasEntity> nariai;

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

    public List<KandidatasEntity> getNariai() {
        return nariai;
    }

    public void setNariai(List<KandidatasEntity> nariai) {
        this.nariai = nariai;
    }

    @Override
    public String toString() {
        return "PartijaEntity{" +
                "id=" + id +
                ", pavadinimas='" + pavadinimas + '\'' +
                ", nariai=" + nariai +
                '}';
    }
}
