package lt.itakademija.electors.apylinke;

import lt.itakademija.electors.RinkejasEntity;
import lt.itakademija.electors.apygarda.ApygardaEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by Pavel on 2017-01-12.
 */
@Entity
public class ApylinkeEntity {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String pavadinimas;

    @NotNull
    private String adresas;

    @OneToMany
    private List<RinkejasEntity> rinkejai;

    @ManyToOne
    @JoinColumn(nullable = true, name= "APYGARDA_ID")
    private ApygardaEntity apygarda;

    public ApygardaEntity getApygarda() {
        return apygarda;
    }

    public void setApygarda(ApygardaEntity apygarda) {
        this.apygarda = apygarda;
    }

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

    public String getAdresas() {
        return adresas;
    }

    public void setAdresas(String adresas) {
        this.adresas = adresas;
    }

    public List<RinkejasEntity> getRinkejai() {
        return rinkejai;
    }

    public void setRinkejai(List<RinkejasEntity> rinkejai) {
        this.rinkejai = rinkejai;
    }
}
