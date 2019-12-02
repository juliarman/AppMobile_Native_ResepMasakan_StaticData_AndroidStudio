package com.juliarmanumar.resepmasakan;

public class Resep {

    private String bahan;
    private String Judul;
    private String Isi;



    public String getPenyajian() {
        return penyajian;
    }

    public void setPenyajian(String penyajian) {
        this.penyajian = penyajian;
    }

    private String penyajian;
    private int GambarResep;

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }


    public String getJudul() {
        return Judul;
    }

    public void setJudul(String judul) {
        Judul = judul;
    }

    public String getIsi() {
        return Isi;
    }

    public void setIsi(String isi) {
        Isi = isi;
    }

    public int getGambarResep() {
        return GambarResep;
    }

    public void setGambarResep(int gambarResep) {
        GambarResep = gambarResep;
    }
}
