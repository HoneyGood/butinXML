package com.butinXML.butinXML.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "vidy_kontr")
public class vidy_kontr {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nazv")
    private String nazv;

    @Column(name = "sokr_nazv")
    private String sokr_nazv;

    @Column(name = "vid_kontr")
    private String vid_kontr;

    @ManyToMany(mappedBy = "vidy_kontrs")
    private Set<disk_semestr> disk_semestrs;

    public Set<disk_semestr> getDisk_semestrs() {
        return disk_semestrs;
    }

    public void setDisk_semestrs(Set<disk_semestr> disk_semestrs) {
        this.disk_semestrs = disk_semestrs;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNazv() {
        return nazv;
    }

    public void setNazv(String nazv) {
        this.nazv = nazv;
    }

    public String getSokr_nazv() {
        return sokr_nazv;
    }

    public void setSokr_nazv(String sokr_nazv) {
        this.sokr_nazv = sokr_nazv;
    }

    public String getVid_kontr() {
        return vid_kontr;
    }

    public void setVid_kontr(String vid_kontr) {
        this.vid_kontr = vid_kontr;
    }
}
