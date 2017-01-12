package lt.itakademija.electors.kandidatas;

import lt.itakademija.electors.partija.PartijaEntity;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Pavel on 2017-01-12.
 */
public class KandidatasReport {
    private Long id;

    private String vardas;

    private String pavarde;

    private Date gimimoData;

    private String partijosPavadinimas;

    private Long partijosId;

    private String aprasymas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getPartijosPavadinimas() {
        return partijosPavadinimas;
    }

    public void setPartijosPavadinimas(String partijosPavadinimas) {
        this.partijosPavadinimas = partijosPavadinimas;
    }

    public Long getPartijosId() {
        return partijosId;
    }

    public void setPartijosId(Long partijosId) {
        this.partijosId = partijosId;
    }

    public String getAprasymas() {
        return aprasymas;
    }

    public void setAprasymas(String aprasymas) {
        this.aprasymas = aprasymas;
    }
}
