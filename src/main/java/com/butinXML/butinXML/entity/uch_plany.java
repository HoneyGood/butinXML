package com.butinXML.butinXML.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

//1
@Entity
@Table(name = "uch_plany")
public class uch_plany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "forma")
    private Character forma;

    @Column(name = "profile")
    private String profile;

    @Column(name = "god_nabora")
    private String god_nabora;

    @Column(name = "institut")
    private String institut;

    @Column(name = "fgos_id")
    private Integer fgos_id;

    @Column(name = "nom_protokola")
    private String nom_protokola;

    @Column(name = "data_utver")
    private Date data_utver;

    @Column(name = "prik_utv_opop")
    private String prik_utv_opop;

    @Column(name = "data_utv_opo")
    private Date data_utv_opo;

    @OneToMany
    @JoinColumn(name = "upl_id")
    private Set<semestry> semestries;

    @OneToMany
    @JoinColumn(name = "upl_id")
    private Set<disc_plana> disc_planas;

    public Set<disc_plana> getDisc_planas() {
        return disc_planas;
    }

    public void setDisc_planas(Set<disc_plana> disc_planas) {
        this.disc_planas = disc_planas;
    }

    public Set<semestry> getSemestries() {
        return semestries;
    }

    public void setSemestries(Set<semestry> semestries) {
        this.semestries = semestries;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Character getForma() {
        return forma;
    }

    public void setForma(Character forma) {
        this.forma = forma;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getGod_nabora() {
        return god_nabora;
    }

    public void setGod_nabora(String god_nabora) {
        this.god_nabora = god_nabora;
    }

    public String getInstitut() {
        return institut;
    }

    public void setInstitut(String institut) {
        this.institut = institut;
    }

    public Integer getFgos_id() {
        return fgos_id;
    }

    public void setFgos_id(Integer fgos_id) {
        this.fgos_id = fgos_id;
    }

    public String getNom_protokola() {
        return nom_protokola;
    }

    public void setNom_protokola(String nom_protokola) {
        this.nom_protokola = nom_protokola;
    }

    public Date getData_utver() {
        return data_utver;
    }

    public void setData_utver(Date data_utver) {
        this.data_utver = data_utver;
    }

    public String getPrik_utv_opop() {
        return prik_utv_opop;
    }

    public void setPrik_utv_opop(String prik_utv_opop) {
        this.prik_utv_opop = prik_utv_opop;
    }

    public Date getData_utv_opo() {
        return data_utv_opo;
    }

    public void setData_utv_opo(Date data_utv_opo) {
        this.data_utv_opo = data_utv_opo;
    }
}
