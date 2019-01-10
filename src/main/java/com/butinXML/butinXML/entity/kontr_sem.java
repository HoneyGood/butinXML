package com.butinXML.butinXML.entity;

import javax.persistence.*;

@Entity
@Table(name = "kontr_sem")
public class kontr_sem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "disk_id")
    private Integer disc_id;

    @Column(name = "kontr_id")
    private Integer kontr_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDisc_id() {
        return disc_id;
    }

    public void setDisc_id(Integer disc_id) {
        this.disc_id = disc_id;
    }

    public Integer getKontr_id() {
        return kontr_id;
    }

    public void setKontr_id(Integer kontr_id) {
        this.kontr_id = kontr_id;
    }
}
