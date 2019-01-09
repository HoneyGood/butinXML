package com.butinXML.butinXML.entity;

import javax.persistence.*;

//3
@Entity
@Table(name = "disc_plana")
public class disc_plana {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "shifr")
    private String shifr;

    @Column(name = "nazv")
    private String nazv;

    @Column(name = "napr")
    private String napr;

    @Column(name = "forma")
    private Character forma;

    @Column(name = "kaf_id")
    private Integer kaf_id;

    @Column(name = "is_module")
    private Character is_module;

    @Column(name = "upl_id")
    private Integer upl_id;

    @Column(name = "zet_exp")
    private Float zet_exp;

    @Column(name = "zet_fact")
    private Float zet_fact;

    @Column(name = "srs")
    private Float srs;

    @Column(name = "kontr")
    private Float kontr;

    @Column(name = "annot")
    private String annot;

    @Column(name = "kont_rab")
    private Float kont_rab;

    @Column(name = "sem_id")
    private Integer sem_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShifr() {
        return shifr;
    }

    public void setShifr(String shifr) {
        this.shifr = shifr;
    }

    public String getNazv() {
        return nazv;
    }

    public void setNazv(String nazv) {
        this.nazv = nazv;
    }

    public String getNapr() {
        return napr;
    }

    public void setNapr(String napr) {
        this.napr = napr;
    }

    public Character getForma() {
        return forma;
    }

    public void setForma(Character forma) {
        this.forma = forma;
    }

    public Integer getKaf_id() {
        return kaf_id;
    }

    public void setKaf_id(Integer kaf_id) {
        this.kaf_id = kaf_id;
    }

    public Character getIs_module() {
        return is_module;
    }

    public void setIs_module(Character is_module) {
        this.is_module = is_module;
    }

    public Integer getUpl_id() {
        return upl_id;
    }

    public void setUpl_id(Integer upl_id) {
        this.upl_id = upl_id;
    }

    public Float getZet_exp() {
        return zet_exp;
    }

    public void setZet_exp(Float zet_exp) {
        this.zet_exp = zet_exp;
    }

    public Float getZet_fact() {
        return zet_fact;
    }

    public void setZet_fact(Float zet_fact) {
        this.zet_fact = zet_fact;
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

    public String getAnnot() {
        return annot;
    }

    public void setAnnot(String annot) {
        this.annot = annot;
    }

    public Float getKont_rab() {
        return kont_rab;
    }

    public void setKont_rab(Float kont_rab) {
        this.kont_rab = kont_rab;
    }

    public Integer getSem_id() {
        return sem_id;
    }

    public void setSem_id(Integer sem_id) {
        this.sem_id = sem_id;
    }
}