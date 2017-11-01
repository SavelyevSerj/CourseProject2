package model;

import javax.persistence.Basic;
import javax.persistence.Entity;

/**
 * Created by BigBadVoodooDaddy on 01.11.2017.
 */
@Entity
public class Document {
    @Basic
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    private String idNumber;

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    @Basic
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Basic
    private String theme;

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    @Basic
    private String year;

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Basic
    private String month;

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    @Basic
    private Integer version;

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Document document = (Document) o;

        if (type != null ? !type.equals(document.type) : document.type != null) return false;
        if (idNumber != null ? !idNumber.equals(document.idNumber) : document.idNumber != null) return false;
        if (status != null ? !status.equals(document.status) : document.status != null) return false;
        if (author != null ? !author.equals(document.author) : document.author != null) return false;
        if (theme != null ? !theme.equals(document.theme) : document.theme != null) return false;
        if (year != null ? !year.equals(document.year) : document.year != null) return false;
        if (month != null ? !month.equals(document.month) : document.month != null) return false;
        return version != null ? version.equals(document.version) : document.version == null;
    }

    @Override
    public int hashCode() {
        int result = type != null ? type.hashCode() : 0;
        result = 31 * result + (idNumber != null ? idNumber.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (theme != null ? theme.hashCode() : 0);
        result = 31 * result + (year != null ? year.hashCode() : 0);
        result = 31 * result + (month != null ? month.hashCode() : 0);
        result = 31 * result + (version != null ? version.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Document{" +
                "type='" + type + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", status='" + status + '\'' +
                ", author='" + author + '\'' +
                ", theme='" + theme + '\'' +
                ", year='" + year + '\'' +
                ", month='" + month + '\'' +
                ", version=" + version +
                '}';
    }
}
