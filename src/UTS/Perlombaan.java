/*
 * Author @arizkinewbie
 */
package UTS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Peserta
{
    int Peserta = 4;
    int[] Nomor = new int[Peserta];
    String[] Nama = new String[Peserta];
}

class Triathlon extends Peserta
{
    void setNomor(int Nomor, int i)
    {
        this.Nomor[i] = Nomor;
    }
    
    void setNama(String Nama, int i)
    {
        this.Nama[i] = Nama;
    }
    
    int getNomor(int i)
    {
        return this.Nomor[i];
    }
    
    String getNama(int i)
    {
        return this.Nama[i];
    }
    
    void printData(int i)
    {
        System.out.println("Peserta Ke : " + (i+1));
        System.out.println("Nomor : " + getNomor(i));
        System.out.println("Nama  : " + getNama(i));
    }
}

class Waktu
{
    Peserta P = new Peserta();
    
    double[] Jam = new double[P.Peserta], Menit = new double[P.Peserta], Detik = new double[P.Peserta];
    
    void setWaktu(double J, double M, double D, int Index)
    {
        this.Jam[Index] = J;
        this.Menit[Index] = M;
        this.Detik[Index] = D;
    }
    
    double getJam(int Index)
    {
        return this.Jam[Index];
    }
    
    double getMenit(int Index)
    {
        return this.Menit[Index];
    }
    
    double getDetik(int Index)
    {
        return this.Detik[Index];
    }
    
    double convertToDetik(double J, double M, double D)
    {
        double convertJam = J*3600;
        double convertMenit = M*60;
        double convertDetik = D;
        double TotalDetik = convertJam+convertMenit+convertDetik;
        
        return TotalDetik;
    }
}

class Panah
{
    Peserta P = new Peserta();
    
    int Kesempatan = 3;
    int Skor = 10;
    
    int[][] Bidang = new int[P.Peserta][Kesempatan];
    int[] TotalSkor = new int[P.Peserta];
    
    int getBidang(int i , int j)
    {
        return this.Bidang[i][j];
    }
}

class LombaPanah
{
    Panah LP = new Panah();
    
    void setSkor(int Skor, int i)
    {
        LP.TotalSkor[i] = Skor;
    }
    
    int getSkor(int i)
    {
        return LP.TotalSkor[i];
    }
}

class Marathon
{
    Peserta P = new Peserta();
    
    double[] Jam = new double[P.Peserta];
    double[] Menit = new double[P.Peserta];
    double[] Detik = new double[P.Peserta];

    double[] Kecepatan = new double[P.Peserta];
    
    double rata2Kecepatan(double TotalDetik)
    {
        double Kecepatan = (10000/TotalDetik);
        return Kecepatan;
    }
}

class LombaMarathon
{
    Waktu W = new Waktu();
    Marathon Ma = new Marathon();
    
    double setKecepatan(double J, double M, double D)
    {
        double TD = W.convertToDetik(J,M,D);
        double Kecepatan = Ma.rata2Kecepatan(TD);
        return Kecepatan;
    }
}

class Benteng
{
    double Tinggi = 3;
    double Lebar = 5;
    
    Peserta P = new Peserta();
    
    double[]Panjang = new double[P.Peserta];
    
    void setPanjang(double P, int i)
    {
        this.Panjang[i] = P;
    }
    
    double getPanjang(int i)
    {
        return this.Panjang[i];
    }
}

class LombaBenteng
{
    Benteng MB = new Benteng();
    
    double cariLuas(double P, double L, double T)
    {
        double Luas = (P*L*T);
        return Luas;
    }
}

public class Perlombaan
{
    public static void main(String[] args) throws IOException 
    {
        Scanner Scan = new Scanner(System.in);
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
        
        Triathlon Peserta = new Triathlon();
        Waktu Mengwaktu = new Waktu();
        
        Panah Memanah = new Panah();
        LombaPanah LombaMemanah = new LombaPanah();
        
        Marathon Mengmarathon = new Marathon();
        LombaMarathon LombaMengmarathon = new LombaMarathon();
        
        Benteng Mengbenteng = new Benteng();
        LombaBenteng Menyusun = new LombaBenteng();
        
        System.out.println("");
        System.out.println( "------------------------------------------------\n"+
                                "               EVENT LOMBA\n"+
                                "             GAME TRADISIONAL \n"+
                                "        \" Kampung Dusun Idaman \"\n"+
                                "------------------------------------------------\n"+
                                "1. Lomba Memanah  \n"+
                                "2. Lomba Marathon 10Km  \n"+
                                "3. Lomba Menyusun Benteng \n"+
                                "------------------------------------------------\n");
        
        /* Input Peserta */
        System.out.println("Alert! Peserta hanya 4 orang.");
        for(int i = 0; i < Peserta.Peserta; i++)
        {
            System.out.print("Masukkan Nama Depan Peserta  : ");
            String tempNama = Scan.next();
            
            System.out.print("Masukkan Nomor Peserta : ");
            int tempNomor = Scan.nextInt();
            
            Peserta.setNama(tempNama, i);
            Peserta.setNomor(tempNomor, i);
            
            System.out.println("");
        }
        
        /* Lomba Memanah */
        System.out.println( "------------------");
        System.out.println(" - LOMBA MEMANAH - ");
        System.out.println( "------------------");
        for(int i = 0; i < Peserta.Peserta; i++)
        {
            Peserta.printData(i);
            System.out.println("");
            
            int Total = 0;
            for(int j = 0; j < 3; j++)
            {
                System.out.print("Kesempatan Memanah Ke-"+(j+1) + " Kena Di Bidang : ");
                int tempBidang = Scan.nextInt();
                
                Memanah.Bidang[i][j] = tempBidang;
                
                if(tempBidang == 1) Total += 100;
                else if(tempBidang > 1 && tempBidang <= 10) Total += 100-((tempBidang-1)*Memanah.Skor);
                else Total += 0;
            }
            LombaMemanah.setSkor(Total, i);
            System.out.println("");
        }
        
        for(int i = 0; i < Peserta.Peserta; i++)
        {
            System.out.println("Peserta Ke-"+(i+1) + " Dengan Nama : " + Peserta.getNama(i));
            for(int j = 0; j < Memanah.Kesempatan; j++)
            {
                System.out.println("Bidang Ke-" + (j+1) + " : " + Memanah.getBidang(i,j));
            }
            System.out.println("");
            System.out.println("Total Skor : " + LombaMemanah.getSkor(i));
            System.out.println("");
        }
        
        /* Lomba Marathon */
        System.out.println( "------------------");
        System.out.println(" - LOMBA MARATHON - ");
        System.out.println( "------------------");
        for(int i = 0; i < Peserta.Peserta; i++)
        {
            Peserta.printData(i);
            System.out.println("");
            
            System.out.print("Peserta Mencapai 10KM Dalam (JJ:MM:DD) : ");
            String[] strWaktu = BR.readLine().split(":");
            
            int tempJam = Integer.parseInt(strWaktu[0]);
            int tempMenit = Integer.parseInt(strWaktu[1]);
            int tempDetik = Integer.parseInt(strWaktu[2]);
            
            Mengwaktu.setWaktu(tempJam, tempMenit, tempDetik, i);

            System.out.println("");
        }
        
        for(int j = 0; j < Peserta.Peserta; j++)
        {
            System.out.println("Peserta Ke-"+(j+1) + " Dengan Nama : " + Peserta.getNama(j));
            System.out.println("Mencapai 10KM Dalam " + Mengwaktu.getJam(j) + " Jam " + Mengwaktu.getMenit(j) + " Menit dan " + Mengwaktu.getDetik(j) + " Detik.");
            double RRK = LombaMengmarathon.setKecepatan(Mengwaktu.getJam(j), Mengwaktu.getMenit(j), Mengwaktu.getDetik(j));
            System.out.println("Kecepatan Rata-Rata : " + RRK + " Meter/Detik.");
            System.out.println("");
        }
        
        /* Lomba Menyusun Benteng */
        System.out.println( "--------------------------");
        System.out.println(" - LOMBA MENYUSUN BENTENG - ");
        System.out.println( "--------------------------");
        System.out.println("Susunlah Benteng dengan tinggi 6m dan lebar 10m ");
        System.out.println("Setiap Peserta Akan Diberi Waktu 5 Jam ");
        System.out.println("");
        for(int i = 0; i < Peserta.Peserta; i++)
        {
            Peserta.printData(i);
            System.out.println("");
            
            System.out.print("Peserta Menyusun Benteng Dengan Panjang : ");
            double tempPanjang = Scan.nextDouble();
            
            Mengbenteng.setPanjang(tempPanjang, i);

            System.out.println("");
        }
        
        for(int j = 0; j < Peserta.Peserta; j++)
        {
            System.out.println("Peserta Ke-"+(j+1) + " Dengan Nama : " + Peserta.getNama(j));
            System.out.println("Peserta Berhasil Menyusun Dengan Panjang : " + Mengbenteng.getPanjang(j) + "m");
            System.out.println("Luas Benteng yang Disusun : " + Menyusun.cariLuas(Mengbenteng.getPanjang(j), Mengbenteng.Lebar, Mengbenteng.Tinggi) + "m kuadrat.");
            System.out.println("");
        }
    }
}