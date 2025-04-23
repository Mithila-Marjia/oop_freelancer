package com.example.freelancerproject.freelancerfinal;

public class M_Marketdemand {

    private String language,platform;
    int demand;


    public M_Marketdemand() {
    }

    public M_Marketdemand(String language, String platform, int demand) {
        this.language = language;
        this.platform = platform;
        this.demand = demand;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public int getDemand() {
        return demand;
    }

    public void setDemand(int demand) {
        this.demand = demand;
    }

    @Override
    public String toString() {
        return "M_Marketdemand{" +
                "language='" + language + '\'' +
                ", platform='" + platform + '\'' +
                ", demand=" + demand +
                '}';
    }
}
