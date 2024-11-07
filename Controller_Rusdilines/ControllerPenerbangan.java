package Controller_Rusdilines;

import java.util.ArrayList;
import Model_Rusdilines.*;

public class ControllerPenerbangan {
    private ArrayList<Penerbangan> penerbangans = new ArrayList<Penerbangan>();

    public ControllerPenerbangan(ArrayList<Penerbangan> penerbangans) {
        this.penerbangans = penerbangans;
    }

    public ArrayList<Penerbangan> getPenerbangans() {
        return penerbangans;
    }

    public void setPenerbangans(ArrayList<Penerbangan> penerbangans) {
        this.penerbangans = penerbangans;
    }

    public double biayaTotalPaket(){
        double harga = 0;
        //biaya total paket berdasarkan tipe pernebangan
        for (Penerbangan penerbangan : penerbangans) {
            if (penerbangan.getTipe_penerbangan().equalsIgnoreCase("Ekonomi")) {
                harga += penerbangan.hitungBiayaTiket();
            }else if(penerbangan.getTipe_penerbangan().equalsIgnoreCase("Bussiness")){
                harga += penerbangan.hitungBiayaTiket();
            }else{
                harga += penerbangan.hitungBiayaTiket();
            }
        }
        return harga;
    }
    
} 