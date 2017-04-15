package com.igouc.gtuapi.dto;

public class ZhuanYeDTO {
    private String majorName;
    private String universityName;
    private String cityName;
    private String year;
    private String pici;
    private String avgScore;
    private String majorUrl;

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPici() {
        return pici;
    }

    public void setPici(String pici) {
        this.pici = pici;
    }

    public String getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(String avgScore) {
        this.avgScore = avgScore;
    }

    public String getMajorUrl() {
        return majorUrl;
    }

    public void setMajorUrl(String majorUrl) {
        this.majorUrl = majorUrl;
    }

    @Override
    public String toString() {
        return "ZhuanYeDTO{" +
                "majorName='" + majorName + '\'' +
                ", universityName='" + universityName + '\'' +
                ", cityName='" + cityName + '\'' +
                ", year='" + year + '\'' +
                ", pici='" + pici + '\'' +
                ", avgScore='" + avgScore + '\'' +
                ", majorUrl='" + majorUrl + '\'' +
                '}';
    }
}
