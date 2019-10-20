package BangunDatar;

class Segitiga extends BangunDatar {

    float alas;
    float tinggi;

    @Override
    float luas() {
        float luas = alas*tinggi;
        System.out.println("luas segitiga = " +luas);
        return luas;
    }


}
