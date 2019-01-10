package com.butinXML.butinXML.entity;

import javax.persistence.*;

//4
@Entity
@Table(name = "disc_semestr")
public class disk_semestr {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "disc_id")
    private Integer disk_id;

    @Column(name = "lect")
    private Float lect;

    @Column(name = "pract")
    private Float pract;

    @Column(name = "lab")
    private Float lab;

    @Column(name = "srs")
    private Float srs;

    @Column(name = "kontr")
    private Float kontr;

    @Column(name = "zet")
    private Integer zet;

    @Column(name = "sem_id")
    private Integer sem_id;

    @Column(name = "nomsemestra")
    private Integer nomsemestra;

    @ManyToOne
    @JoinColumn(name = "sem_id",insertable = false,updatable = false)
    private semestry semestry;

    @ManyToOne
    @JoinColumn(name = "disc_id",insertable = false,updatable = false)
    private disc_plana disc_plana;

    public com.butinXML.butinXML.entity.disc_plana getDisc_plana() {
        return disc_plana;
    }

    public void setDisc_plana(com.butinXML.butinXML.entity.disc_plana disc_plana) {
        this.disc_plana = disc_plana;
    }

    public com.butinXML.butinXML.entity.semestry getSemestry() {
        return semestry;
    }

    public void setSemestry(com.butinXML.butinXML.entity.semestry semestry) {
        this.semestry = semestry;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDisk_id() {
        return disk_id;
    }

    public void setDisk_id(Integer disk_id) {
        this.disk_id = disk_id;
    }

    public Float getLect() {
        return lect;
    }

    public void setLect(Float lect) {
        this.lect = lect;
    }

    public Float getPract() {
        return pract;
    }

    public void setPract(Float pract) {
        this.pract = pract;
    }

    public Float getLab() {
        return lab;
    }

    public void setLab(Float lab) {
        this.lab = lab;
    }

    public Float getSrs() {
        return srs;
    }

    public void setSrs(Float srs) {
        this.srs = srs;
    }

    public Float getKontr() {
        return kontr;
    }

    public void setKontr(Float kontr) {
        this.kontr = kontr;
    }

    public Integer getZet() {
        return zet;
    }

    public void setZet(Integer zet) {
        this.zet = zet;
    }

    public Integer getSem_id() {
        return sem_id;
    }

    public void setSem_id(Integer sem_id) {
        this.sem_id = sem_id;
    }

    public Integer getNomsemestra() {
        return nomsemestra;
    }

    public void setNomsemestra(Integer nomsemestra) {
        this.nomsemestra = nomsemestra;
    }
}
