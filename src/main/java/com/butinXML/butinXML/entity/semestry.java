package com.butinXML.butinXML.entity;

import net.bytebuddy.implementation.bind.annotation.Default;

import javax.persistence.*;
import java.util.Date;

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
