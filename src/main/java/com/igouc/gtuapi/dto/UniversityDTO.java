package com.igouc.gtuapi.dto;

public class UniversityDTO {
    private String universityName;
    private String cityName;
    private String url;
    private String kebie;
    private String pici;
    private String scoreLimit;
    private String year;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getKebie() {
        return kebie;
    }

    public void setKebie(String kebie) {
        this.kebie = kebie;
    }

    public String getPici() {
        return pici;
    }

    public void setPici(String pici) {
        this.pici = pici;
    }

    public String getScoreLimit() {
        return scoreLimit;
    }

    public void setScoreLimit(String scoreLimit) {
        this.scoreLimit = scoreLimit;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "UniversityDTO{" +
                "universityName='" + universityName + '\'' +
                ", cityName='" + cityName + '\'' +
                ", url='" + url + '\'' +
                ", kebie='" + kebie + '\'' +
                ", pici='" + pici + '\'' +
                ", scoreLimit='" + scoreLimit + '\'' +
                ", year='" + year + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UniversityDTO that = (UniversityDTO) o;

        if (!universityName.equals(that.universityName)) return false;
        if (!cityName.equals(that.cityName)) return false;
        return kebie.equals(that.kebie);

    }

    @Override
    public int hashCode() {
        int result = universityName.hashCode();
        result = 31 * result + cityName.hashCode();
        result = 31 * result + kebie.hashCode();
        return result;
    }
}
