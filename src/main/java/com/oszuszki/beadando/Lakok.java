package com.oszuszki.beadando;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "kolikk")
public class Lakok {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Column(name= "nev")
    private String nev;
    @Column(name = "emelet")
    private Integer emelet;
    @Column(name = "szoba")
    private Integer szoba;

    public Lakok() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public Integer getEmelet() {
        return emelet;
    }

    public void setEmelet(Integer emelet) {
        this.emelet = emelet;
    }

    public Integer getSzoba() {
        return szoba;
    }

    public void setSzoba(Integer szoba) {
        this.szoba = szoba;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Lakok))
            return false;
        Lakok lakok = (Lakok) o;
        return Objects.equals(this.id, lakok.id) && Objects.equals(this.nev, lakok.nev)
                && Objects.equals(this.emelet, lakok.emelet) && Objects.equals(this.szoba, lakok.szoba);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.nev, this.emelet, this.szoba);
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + this.id + ", nev='" + this.nev + '\'' + ", emelet='" + this.emelet + '\'' + "szoba=" + this.szoba +  + '}';
    }

}
