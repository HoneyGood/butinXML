package com.butinXML.butinXML.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

//2
@Entity
@Table(name = "semestry")
public class semestry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "upl_id")
    private Integer upl_id;

    @Column(name = "nomer")
    private Integer nomer;

    @Column(name = "nedel")
    private Integer nedel;

    @Column(name = "nach")
    private Date nach;

    @Column(name = "okon")
    private Date okon;

    @Column(name = "vid")
    private Character vid;

    @OneToMany
    @JoinColumn(name = "sem_id")
    private Set<disc_plana> disc_planas;

    @ManyToOne
    @JoinColumn(name = "upl_id",insertable = false, updatable = false)
    private uch_plany uch_plany;

    @OneToMany
    @JoinColumn(name = "sem_id")
    private Set<disk_semestr> disk_semestrs;

    public Set<disk_semestr> getDisk_semestrs() {
        return disk_semestrs;
    }

    public void setDisk_semestrs(Set<disk_semestr> disk_semestrs) {
        this.disk_semestrs = disk_semestrs;
    }

    public Set<disc_plana> getDisc_planas() {
        return disc_planas;
    }

    public void setDisc_planas(Set<disc_plana> disc_planas) {
        this.disc_planas = disc_planas;
    }

    public com.butinXML.butinXML.entity.uch_plany getUch_plany() {
        return uch_plany;
    }

    public void setUch_plany(com.butinXML.butinXML.entity.uch_plany uch_plany) {
        this.uch_plany = uch_plany;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUpl_id() {
        return upl_id;
    }

    public void setUpl_id(Integer upl_id) {
        this.upl_id = upl_id;
    }

    public Integer getNomer() {
        return nomer;
    }

    public void setNomer(Integer nomer) {
        this.nomer = nomer;
    }

    public Integer getNedel() {
        return nedel;
    }

    public void setNedel(Integer nedel) {
        this.nedel = nedel;
    }

    public Date getNach() {
        return nach;
    }

    public void setNach(Date nach) {
        this.nach = nach;
    }

    public Date getOkon() {
        return okon;
    }

    public void setOkon(Date okon) {
        this.okon = okon;
    }

    public Character getVid() {
        return vid;
    }

    public void setVid(Character vid) {
        this.vid = vid;
    }
}
