package View_Rusdilines;
import Model_Rusdilines.*;

import java.util.*;

import Controller_Rusdilines.*;

public class Main{

    static Scanner scan = new Scanner(System.in);

    public static void menu(){
        ArrayList<Penerbangan> penerbangans = new ArrayList<Penerbangan>();
        boolean next = true;
        while(next){
            //Asumsi input selalu benar
            System.out.print("Mau booking penerbangan:");
            boolean booking = scan.nextBoolean();
            if (next) {
                System.out.print("Jenis Penerbangan:\n1. Kelas Ekonomi\n2. Kelas Bisnis\n3. Kelas First\nPilih: ");
                String jenis = scan.next();
                System.out.print("Jarak Tempuh:");
                double jarak = scan.nextDouble();
                System.out.print("Berat Bagasi: ");
                double berat = scan.nextDouble();
                String mau_pesan = "";
                if (jenis.equalsIgnoreCase("Ekonomi")) {
                    penerbangans.add(new Ekonomi(jenis, jarak, berat));
                }else if(jenis.equalsIgnoreCase("Bussiness")){
                    PesanMakanan pesan = PesanMakanan.TIDAK_PESAN;
                    System.out.print("Pesan Makanan (PESAN/TIDAK PESAN):");
                    mau_pesan = scan.next();
                    if (mau_pesan.equalsIgnoreCase("PESAN")) {
                        pesan = PesanMakanan.PESAN;
                    }
                    penerbangans.add(new Bussiness(jenis, jarak, berat,pesan));
                }else if(jenis.equalsIgnoreCase("First")){
                    PesanMakanan pesan = PesanMakanan.TIDAK_PESAN;
                    System.out.print("Pesan Makanan (PESAN/TIDAK_PESAN):");
                    mau_pesan = scan.next();
                    if (mau_pesan.equalsIgnoreCase("PESAN")) {
                        pesan = PesanMakanan.PESAN;
                        ArrayList<Makanan> makanans = new ArrayList<Makanan>();
                        boolean order = true;
                        while (order) {
                            System.out.print("Mau pesan: ");
                            boolean orderan = scan.nextBoolean();
                            if (next) {
                                System.out.print("Nasi Goreng atau Mie Goreng?: ");
                                String food = scan.next();
                                if (food.equalsIgnoreCase("Nasi Goreng")) {
                                    makanans = Makanan.NASI_GORENG;
                                }
                            }
                            
                        }
    
                    }else if(mau_pesan.equalsIgnoreCase("TIDAK PESAN")){
                    
                    }
                    
                }
                
            }
        }
    }

    public static void main(String[] args) {
      
       
    }
}