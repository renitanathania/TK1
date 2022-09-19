import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Membuat Variabel jumlah orang dan nama pemesan
        byte jumlahOrang;
        String namaPemesan;

        // Harga makanan
        float nasiGoreng    = 9999.99f;
        float ayamBakar     = 12345.67f;
        float steakSirloin  = 21108.40f;
        float kwetiawSiram  = 13579.13f;
        float kambingGuling = 98765.43f;


        Scanner input = new Scanner(System.in);

        System.out.println("Selamat Siang ...");

        System.out.print("Pesan untuk berapa orang \t: ");
        jumlahOrang = input.nextByte();
        System.out.print("Pesanan atas nama \t\t\t: ");
        namaPemesan = input.next();
        System.out.println();

        System.out.println("Menu Spesial Hari Ini");
        System.out.println("=====================");
        System.out.print("\t1. Nasi Goreng Spesial        @ Rp.");
        System.out.printf("%.2f\n", nasiGoreng);
        System.out.print("\t2. Ayam Bakar Spesial         @ Rp.");
        System.out.printf("%.2f\n", ayamBakar);
        System.out.print("\t3. Steak Sirloin Spesial      @ Rp.");
        System.out.printf("%.2f\n", steakSirloin);
        System.out.print("\t4. Kwetiauw Siram Spesial     @ Rp.");
        System.out.printf("%.2f\n", kwetiawSiram);
        System.out.print("\t5. Kambing Guling Spesial     @ Rp.");
        System.out.printf("%.2f\n", kambingGuling);
        System.out.println();

        System.out.println("Pesanan Anda [batas pesanan 0-10 porsi]");
        System.out.print("1. Nasi Goreng Spesial    = ");
        byte pesanNasiGoreng = input.nextByte();
        System.out.print("2. Ayam Bakar Spesial     = ");
        byte pesanAyamBakar = input.nextByte();
        System.out.print("3. Steak Sirloin Spesial  = ");
        byte pesanSteak = input.nextByte();
        System.out.print("4. Kwetiauw Siram Spesial = ");
        byte pesanKwetiaw = input.nextByte();
        System.out.print("5. Kambing Guling Spesial = ");
        byte pesanKambing = input.nextByte();
        System.out.println();

        System.out.println("Selamat menikmati makanan anda ...");
        System.out.println();

        float totalNasiGoreng = pesanNasiGoreng * nasiGoreng;
        float totalAyamBakar = pesanAyamBakar * ayamBakar;
        float totalSteakSirloin = pesanSteak * steakSirloin;
        float totalKwetiauwSiram = pesanKwetiaw * kwetiawSiram;
        float totalKambingGuling = pesanKambing * kambingGuling;

        System.out.println("Pembelian :");
        System.out.println();
        System.out.print("1. Nasi Goreng Spesial      " + pesanNasiGoreng + " porsi * Rp. " + nasiGoreng    + "\t= Rp. ");
        System.out.printf("%.2f\n", totalNasiGoreng);
        System.out.print("2. Ayam Bakar Spesial       " + pesanAyamBakar  + " porsi * Rp. " + ayamBakar     + "\t= Rp. ");
        System.out.printf("%.2f\n", totalAyamBakar);
        System.out.print("3. Steak Sirloin Spesial    " + pesanSteak      + " porsi * Rp. " + steakSirloin  + "\t= Rp. ");
        System.out.printf("%.2f\n", totalSteakSirloin);
        System.out.print("4. Kwetiauw Siram Spesial   " + pesanKwetiaw    + " porsi * Rp. " + kwetiawSiram  + "\t= Rp. ");
        System.out.printf("%.2f\n", totalKwetiauwSiram);
        System.out.print("5. Kambing Guling Spesial   " + pesanKambing    + " porsi * Rp. " + kambingGuling + "\t= Rp. ");
        System.out.printf("%.2f", totalKambingGuling);
        System.out.println(" +");
        System.out.println("=====================================================================");

        float totalPembelian = totalNasiGoreng + totalAyamBakar + totalSteakSirloin + totalKwetiauwSiram + totalKambingGuling;
        System.out.print("Total Pembelian \t\t\t\t\t\t\t\t\t= Rp. ");
        System.out.printf("%.2f\n", totalPembelian);
        System.out.println("");

        float diskon = totalPembelian *10 /100;
        System.out.print("Disc. 10% <Masa Promosi> \t\t\t\t\t\t\t= Rp. ");
        System.out.printf("%.2f", diskon);
        System.out.println("  -");
        System.out.println("=====================================================================");

        float totalHarga = totalPembelian - diskon;
        System.out.print("Total Pembelian setelah disc 10% \t\t\t\t\t= Rp. ");
        System.out.printf("%.2f\n", totalHarga);

        float hargaPerOrang = totalHarga / jumlahOrang;
        System.out.print("Pembelian per orang <untuk " + jumlahOrang + " orang> \t\t\t\t= Rp. ");
        System.out.printf("%.2f\n", hargaPerOrang);
        System.out.println();

        System.out.println("\t\t\tTerima kasiha atas kunjungan Anda...");
        System.out.println("\t\t\t\t...tekan ENTER untuk keluar...");
    }
}