package com.hanaad.demo.Model;

import javax.persistence.*;

public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    private String navn;

    @Column(unique = true)
    private String brukernavn;

    private String passord;
    private String email;

    @ManyToOne
    private Authority authority;

    public User() {}

    public User(String navn, String brukernavn, String passord, String email) {
        this.navn = navn;
        this.brukernavn = brukernavn;
        this.setPassord(passord);
        this.setEmail(email);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getPassord() {
        return passord;
    }

    public void setPassord(String passord) {
        this.passord = passord;
    }

    public String getBrukernavn() { return brukernavn; }

    public void setBrukernavn(String brukernavn) {
        this.brukernavn = brukernavn;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Authority getAuthority() {
        return authority;
    }

    public void setAuthority(Authority authority) {
        this.authority = authority;
    }

}
