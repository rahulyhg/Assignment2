package com.example.ahsan.assignment5;

/**
 * Created by AHSAN on 10/4/2017.
 */

public class Cities {
    private String name;
    private String lat;
    private String lon;
    private String TZ;

    public Cities(String name,String lat,String lon,String TZ)
    {
        this.name = name;
        this.lat = lat;
        this.lon = lon;
        this.TZ = TZ;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getTZ() {
        return TZ;
    }

    public void setTZ(String TZ) {
        this.TZ = TZ;
    }
}
