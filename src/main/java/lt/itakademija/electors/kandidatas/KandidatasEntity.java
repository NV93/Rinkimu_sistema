package lt.itakademija.electors.kandidatas;

import lt.itakademija.electors.partija.PartijaEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Pavel on 2017-01-12.
 */
@Entity
public class KandidatasEntity {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String vardas;

    @NotNull
    private String pavarde;

    @NotNull
    private Date gimimoData;

    @ManyToOne
    @JoinColumn(nullable = true, name= "PARTIJA_ID")
    private PartijaEntity partinePriklausomybe;

    private String aprasymas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PartijaEntity getPartinePriklausomybe() {
        return partinePriklausomybe;
    }

    public void setPartinePriklausomybe(PartijaEntity partinePriklausomybe) {
        this.partinePriklausomybe = partinePriklausomybe;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public Date getGimimoData() {
        return gimimoData;
    }

    public void setGimimoData(Date gimimoData) {
        this.gimimoData = gimimoData;
    }

    public String getAprasymas() {
        return aprasymas;
    }

    public void setAprasymas(String aprasymas) {
        this.aprasymas = aprasymas;
    }
}
