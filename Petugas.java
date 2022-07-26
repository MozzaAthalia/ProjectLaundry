/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author Lenovo
 */
public class Petugas implements user{ //bentuk pewarisan karena ada implements
private ArrayList<String> namaPetugas = new ArrayList<String>(); 
private ArrayList<String> alamat = new ArrayList<String>(); 
private ArrayList<String> telepon = new ArrayList<String>(); 
private ArrayList<String> jabatan = new ArrayList<String>();

public Petugas (){ //keywoard this buat pemanggil methods kelas itu sendiri , pembuatan kelas untuk menyatakan objek
    this.namaPetugas.add("Acha");
    this.alamat.add("Tulungagung");
    this.telepon.add("0812345678");
    this.jabatan.add("Pemilik toko");
    
    this.namaPetugas.add("Zahra");
    this.alamat.add("Nganjuk");
    this.telepon.add("0812345678");
    this.jabatan.add("Petugas cuci");
    
    this.namaPetugas.add("Keysha");
    this.alamat.add("Pacitan");
    this.telepon.add("0812345678");
    this.jabatan.add("Petugas setrika");
    
    this.namaPetugas.add("Billa");
    this.alamat.add("Malang");
    this.telepon.add("0812345678");
    this.jabatan.add("Petugas packing");
}
public void setJabatan(String jabatan){ 
    this.jabatan.add(jabatan);
}
public String getJabatan(int id){
    return this.jabatan.get(id);
}
public int getJmlPetugas(){
    return this.namaPetugas.size();
}

    @Override //mengimplementasi kembali subclas
    public void setNama(String namaKaryawan) {
        this.namaPetugas.add(namaKaryawan);
    }

    @Override
    public void setAlamat(String alamat) {
        this.namaPetugas.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.namaPetugas.add(telepon);
    }

    @Override
    public String getNama(int idKaryawan) {
        return this.namaPetugas.get(idKaryawan);
    }

    @Override
    public String getTelepon(int idKaryawan) {
        return this.telepon.get(idKaryawan);
    }

    @Override
    public String getAlamat(int idKaryawan) {
        return this.alamat.get(idKaryawan);
    }
    
}