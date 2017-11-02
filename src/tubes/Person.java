/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

/**
 *
 * @author Talitha Farah
 */
public abstract class Person {
    private String nama;
    private String jeniskelamin;
    private int umur;
    private String id;
    private String username;
    private String passwoard;

    public Person(String nama, String jeniskelamin, int umur, String id, String username, String passwoard) {
        this.nama = nama;
        this.jeniskelamin = jeniskelamin;
        this.umur = umur;
        this.id = id;
        this.username = username;
        this.passwoard = passwoard;
    }

    public String getUsername() {
        return username;
    }

    public String getPasswoard() {
        return passwoard;
    }

    public abstract String getId();

    public String getNama() {
        return nama;
    }

    public String getJeniskelamin() {
        return jeniskelamin;
    }

    public int getUmur() {
        return umur;
    }
    
    
}

