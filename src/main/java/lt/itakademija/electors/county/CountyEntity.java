package lt.itakademija.electors.county;

import lt.itakademija.electors.district.DistrictEntity;
import lt.itakademija.electors.kandidatas.KandidatasEntity;
import lt.itakademija.electors.partija.PartijaEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by Pavel on 2017-01-12.
 */
@Entity
public class CountyEntity {

    @Id
    @GeneratedValue
    @Column(name = "COUNTY_ID")
    private Long id;

    @NotNull
    private String name;

    @OneToMany(mappedBy="county", cascade = CascadeType.ALL)
    private List<DistrictEntity> districts;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<DistrictEntity> getDistricts() {
        return districts;
    }

    public void setDistricts(List<DistrictEntity> districts) {
        this.districts = districts;
    }

    public List<KandidatasEntity> getKandidatai() {
        return kandidatai;
    }

    public void setKandidatai(List<KandidatasEntity> kandidatai) {
        this.kandidatai = kandidatai;
    }
}
