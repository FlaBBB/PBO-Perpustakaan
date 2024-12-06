/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author FlaB
 */
import java.util.ArrayList;
import java.sql.*;
public class Pegawai {
    private int idPegawai;
    private String username;
    private String password;
    private String alamat;
    private String telepon;

    public Pegawai(int idPegawai, String username, String password, String alamat, String telepon) {
        this.idPegawai = idPegawai;
        this.username = username;
        this.password = password;
        this.alamat = alamat;
        this.telepon = telepon;
    }

    public Pegawai() {}

    public int getIdPegawai() {
        return idPegawai;
    }

    public void setIdPegawai(int idPegawai) {
        this.idPegawai = idPegawai;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAlamat() {
        return alamat;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public static Pegawai getById(int idPegawai){
        Pegawai pgw = new Pegawai();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM pegawai" + "WHERE idPegawai = '" + idPegawai + "'");
        
        try{
            while(rs.next()){
                pgw = new Pegawai();
                pgw.setUsername(rs.getString("username"));
                pgw.setPassword(rs.getString("password"));
                pgw.setAlamat(rs.getString("alamat"));
                pgw.setTelepon(rs.getString("telepon"));
            }
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
        return pgw;
    }
    
    public void save() {
        if(getById(idPegawai).getIdPegawai() == 0){
            String SQL = "INSERT INTO pegawai (username, password, alamat, telepon) VALUES("
                    + " '" + this.username + "', "
                    + " '" + this.password + "', "
                    + " '" + this.alamat + "', "
                    + " '" + this.telepon + "' "
                    + " )";
        }
    }
}
