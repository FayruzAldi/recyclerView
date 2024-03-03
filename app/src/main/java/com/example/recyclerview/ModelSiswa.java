package com.example.recyclerview;

public class ModelSiswa {
    private String nama;
    private String noAbsen;
    private String image;

    public ModelSiswa(String nama, String noAbsen, String image) {
        this.nama = nama;
        this.noAbsen = noAbsen;
        this.image = image;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoAbsen() {
        return noAbsen;
    }

    public void setNoAbsen(String noAbsen) {
        this.noAbsen = noAbsen;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
