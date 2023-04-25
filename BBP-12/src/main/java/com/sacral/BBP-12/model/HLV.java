package com.sacral.BBP-12.model;

import javax.persistence.*;

@Entity
@Table(name = "HLV")
public class HLV {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "crif_score")
    private int crifScore;

    @Column(name = "hlv")
    private Integer hlv;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCrifScore() {
        return crifScore;
    }

    public void setCrifScore(int crifScore) {
        this.crifScore = crifScore;
    }

    public Integer getHlv() {
        return hlv;
    }

    public void setHlv(Integer hlv) {
        this.hlv = hlv;
    }
}