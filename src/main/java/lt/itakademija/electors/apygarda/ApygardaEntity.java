package lt.itakademija.electors.apygarda;

import lt.itakademija.electors.ApylinkeEntity;
import lt.itakademija.electors.kandidatas.KandidatasEntity;
import lt.itakademija.electors.partija.PartijaEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by Pavel on 2017-01-12.
 */
@Entity
public class ApygardaEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String pavadinimas;

    @OneToMany
    private List<ApylinkeEntity> apylinkes;

    @OneToMany
    private List<KandidatasEntity> kandidatai;

    @OneToMany
    private List<PartijaEntity> partijos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<PartijaEntity> getPartijos() {
        return partijos;
    }

    public void setPartijos(List<PartijaEntity> partijos) {
        this.partijos = partijos;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public List<ApylinkeEntity> getApylinkes() {
        return apylinkes;
    }

    public void setApylinkes(List<ApylinkeEntity> apylinkes) {
        this.apylinkes = apylinkes;
    }

    public List<KandidatasEntity> getKandidatai() {
        return kandidatai;
    }

    public void setKandidatai(List<KandidatasEntity> kandidatai) {
        this.kandidatai = kandidatai;
    }
}
