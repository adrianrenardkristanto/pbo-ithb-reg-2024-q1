package Model_Rusdilines;

public class Ekonomi extends Penerbangan{
    private double jarak_tempuh = 10;

    public Ekonomi(String tipe_penerbangan, double km, double berat_bagasi) {
        super(tipe_penerbangan, km, berat_bagasi);
    }

    public double getJarak_tempuh() {
        return jarak_tempuh;
    }

    public void setJarak_tempuh(double jarak_tempuh) {
        this.jarak_tempuh = jarak_tempuh;
    }
    
    @Override
    public double hitungBiayaTiket(){
        double harga = 0; 
        if (getBerat_bagasi() > 5) {
            harga = getBerat_bagasi() * 1500;
        }else{
            harga = getkm() * 7500;
        }
        return harga + 5000;
    }
}
