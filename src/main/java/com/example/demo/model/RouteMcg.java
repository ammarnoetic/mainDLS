package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "routemcg", schema = "public", catalog = "postgres")
public class RouteMcg {

    @Id
    @Column(name = "id")
    private int id;
    @Column(name="msisdn")
    private String msisdn;
    @Column(name = "shortcode")
    private String shortcode;
    @Column(name = "mcg")
    private String mcg;
    @Column(name = "connectivitypointid")
    private int connectivitypointid;
    @Column(name="serviceid")
    private int serviceid;
    @Column(name="delieveryreport")
    private int delieveryreport;


    public RouteMcg(){

    }

    public RouteMcg(int id, String msisdn, String shortcode, String mcg, int connectivitypointid, int serviceid, int delieveryreport) {
        this.id = id;
        this.msisdn = msisdn;
        this.shortcode = shortcode;
        this.mcg = mcg;
        this.connectivitypointid = connectivitypointid;
        this.serviceid = serviceid;
        this.delieveryreport = delieveryreport;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getShortcode() {
        return shortcode;
    }

    public void setShortcode(String shortcode) {
        this.shortcode = shortcode;
    }

    public String getMcg() {
        return mcg;
    }

    public void setMcg(String mcg) {
        this.mcg = mcg;
    }

    public int getConnectivitypointid() {
        return connectivitypointid;
    }

    public void setConnectivitypointid(int connectivitypointid) {
        this.connectivitypointid = connectivitypointid;
    }

    public int getServiceid() {
        return serviceid;
    }

    public void setServiceid(int serviceid) {
        this.serviceid = serviceid;
    }

    public int getDelieveryreport() {
        return delieveryreport;
    }

    public void setDelieveryreport(int delieveryreport) {
        this.delieveryreport = delieveryreport;
    }

    @Override
    public String toString() {
        return "RouteMcg{" +
                "id=" + id +
                ", msisdn='" + msisdn + '\'' +
                ", shortcode='" + shortcode + '\'' +
                ", mcg='" + mcg + '\'' +
                ", connectivitypointid=" + connectivitypointid +
                ", serviceid=" + serviceid +
                ", delieveryreport=" + delieveryreport +
                '}';
    }
}
