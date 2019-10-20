package BangunDatar;

class PersegiPanjang extends BangunDatar{
    float panjang;
    float lebar;

    @Override
    float luas() {
        float luas = panjang*lebar;
        System.out.println("keliling persegi panjang = "+luas);
        return luas;
    }

    @Override
    float keliling() {
        float keliling = 2 * panjang * lebar;
        System.out.println("keliling persegi panjang = "+keliling);
        return keliling;
    }
}
