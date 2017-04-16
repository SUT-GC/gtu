package com.igouc.gtuapi.dto;

public class ZhuanYeDTO {
    private String majorName;
    private String universityName;
    private String cityName;
    private String year;
    private String pici;
    private String avgScore;
    private String majorUrl;
    private String kebie;

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

    public String getKebie() {
        return kebie;
    }

    public void setKebie(String kebie) {
        this.kebie = kebie;
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
                ", kebie='" + kebie + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ZhuanYeDTO that = (ZhuanYeDTO) o;

        if (majorName != null ? !majorName.equals(that.majorName) : that.majorName != null) return false;
        if (universityName != null ? !universityName.equals(that.universityName) : that.universityName != null)
            return false;
        if (cityName != null ? !cityName.equals(that.cityName) : that.cityName != null) return false;
        if (year != null ? !year.equals(that.year) : that.year != null) return false;
        if (pici != null ? !pici.equals(that.pici) : that.pici != null) return false;
        if (avgScore != null ? !avgScore.equals(that.avgScore) : that.avgScore != null) return false;
        return majorUrl != null ? majorUrl.equals(that.majorUrl) : that.majorUrl == null;

    }

    @Override
    public int hashCode() {
        int result = majorName != null ? majorName.hashCode() : 0;
        result = 31 * result + (universityName != null ? universityName.hashCode() : 0);
        result = 31 * result + (cityName != null ? cityName.hashCode() : 0);
        result = 31 * result + (year != null ? year.hashCode() : 0);
        result = 31 * result + (pici != null ? pici.hashCode() : 0);
        result = 31 * result + (avgScore != null ? avgScore.hashCode() : 0);
        result = 31 * result + (majorUrl != null ? majorUrl.hashCode() : 0);
        return result;
    }
}
