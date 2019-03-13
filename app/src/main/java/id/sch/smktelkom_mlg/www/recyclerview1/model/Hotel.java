package id.sch.smktelkom_mlg.www.recyclerview1.model;

import android.graphics.drawable.Drawable;

/**
 * Created by Laptop on 3/12/2019.
 */

public class Hotel {
    public String judul, deskripsi;
    public Drawable foto;

    public Hotel(String judul, String deskripsi, Drawable foto) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.foto = foto;
    }
}
