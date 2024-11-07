package Model_Rusdilines;

public abstract class Penerbangan{
    private String tipe_penerbangan;
    public double km;
    private double berat_bagasi;
    public Penerbangan(String tipe_penerbangan, double km, double berat_bagasi) {
        this.tipe_penerbangan = tipe_penerbangan;
        this.km = km;
        this.berat_bagasi = berat_bagasi;
    }
    public String getTipe_penerbangan() {
        return tipe_penerbangan;
    }
    public void setTipe_penerbangan(String tipe_penerbangan) {
        this.tipe_penerbangan = tipe_penerbangan;
    }
    public double getkm() {
        return km;
    }
    public void setkm(double km) {
        this.km = km;
    }
    public double getBerat_bagasi() {
        return berat_bagasi;
    }
    public void setBerat_bagasi(double berat_bagasi) {
        this.berat_bagasi = berat_bagasi;
    }
    
    public abstract double hitungBiayaTiket();
}
