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
    private String username;
    private String password;

    public Person(String nama, String jeniskelamin, int umur, String username, String password) {
        this.nama = nama;
        this.jeniskelamin = jeniskelamin;
        this.umur = umur;
        this.username = username;
        this.password = password;
    }
    public Person(){
        
    }
    public String getUsername() {
        return username;
    }

    public String getPasswoard() {
        return password;
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

