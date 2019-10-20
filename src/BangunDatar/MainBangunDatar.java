package BangunDatar;

public class MainBangunDatar {
    public static void main(String[] args) {

        Persegi persegi = new Persegi();
        persegi.sisi=8;

        Segitiga segitiga = new Segitiga();
        segitiga.alas=4;
        segitiga.tinggi=2;

        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 22 ;

        PersegiPanjang persegiPanjang = new PersegiPanjang() ;

        persegiPanjang.panjang=4;
        persegiPanjang.lebar=8;

        persegi.luas();
        persegi.keliling();

        segitiga.luas();

        lingkaran.luas();
        lingkaran.keliling();

        persegiPanjang.luas();
        persegiPanjang.keliling();
    }

}
