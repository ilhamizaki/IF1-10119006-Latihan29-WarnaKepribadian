/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119006.latihan29.warnakepribadian;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Ilham zaki
 * Kelas    : IF 1
 * NIM      : 10119006
 * Deskripsi Program : Menentukan warna kepribadian
 */
public class IF110119006Latihan29WarnaKepribadian {
        static Scanner scan = new Scanner(System.in);
        static String foreground = "\033[38;2;";
        static String background = "\033[48;2;";
        static String netral[] = {"\033[0m", "\033[38;2;255;255;255m"};
        String warna, nama;
        
        String[] merah = {
                "MERAH",
                "255;0;0m",
                "1. Periang,\n" +
                "2. Pemberani,\n" +
                "3. Berani mengambil risiko dalam setiap langkah,\n" +
                "4. Menyukai tantangan,\n" +
                "5. Kurang sabar,\n" +
                "6. Dapat menahan marah namun jika sudah tahap puncak toleransi, kemarahannya sulit dikontrol,\n" +
                "7. memiliki energi kehangatan dan cinta."
        };
        
        String[] hijau = {
                "HIJAU",
                "0;255;0m",
                "1. Romantis,\n" +
                "2. Menyukai hal yang berbau alami dan keindahan,\n" +
                "3. Teguh pada prinsip,\n" +
                "4. Menginginkan kesempurnaan,\n" +
                "5. Mudah cemburu,\n" +
                "6. Mudah merasa iri,\n" +
                "7. Menjungjung tinggi suatu nilai toleransi dan kepercayaan."
        };
        
        String[] kuning = {
                "KUNING",
                "255;255;0m",
                "1. Optimis,\n" +
                "2. Suka bergaul,\n" +
                "3. Periang,\n" +
                "4. Senang menolong,\n" +
                "5. Lincah dan aktif,\n" +
                "6. Tidak suka meremehkan kekurangan orang lain,\n" +
                "7. Loyal,\n" +
                "8. Hangat,\n" +
                "9. Meskipun karakternya optimis dan idealis, seringkali goyah dan tidak stabil,\n" +
                "10. Cenderung penakut."
        };
        
        String[] biru = {
                "BIRU",
                "0;0;255m",
                "1. Menyenangkan,\n" +
                "2. Bijaksana,\n" +
                "3. Pembawaan diri tenang saat menghadapi masalah,\n" +
                "4. Dinamis,\n" +
                "5. Senang berbagi,\n" +
                "6. Bersahabat,\n" +
                "7. Tidak terlalu suka menjadi sorotan banyak orang,\n" +
                "8. Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai."
        };
        
        String[] ungu = {
                "UNGU",
                "255;0;255m",
                "1. Optimis,\n" +
                "2. Tidak pernah ragu,\n" +
                "3. Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat,\n" +
                "4. Memiliki ambisi yang besar,\n" +
                "5. Memiliki empati yang besar,\n" +
                "6. Memiliki sisi misterius sebeb seringkali menutupi perasaannya,\n" +
                "7. Terkadang bersikap keras kepala dan angkuh."
        };
        
        private void masukkanWarna() {
            String[][] color = {merah, hijau, kuning, ungu, biru};
                System.out.println(foreground.concat(merah[1]).concat("YUK ")
                           .concat(foreground).concat(hijau[1]).concat("CEK ")
                           .concat(foreground).concat(kuning[1]).concat("KEPRIBADIANMU  ")
                           .concat(foreground).concat(hijau[1]).concat("DARI ")
                           .concat(foreground).concat(ungu[1]).concat("WARNA ")
                           .concat(foreground).concat(biru[1]).concat("FAVORITMU\n"));
            for (String[] x : color) {
                System.out.println(background.concat(x[1]).concat(netral[1]).concat("\t\t")
                        .concat(x[0]).concat("\t\t").concat(netral[0]));
            }
            
            System.out.print("\nPILIH WARNA FAVORITMU : ");
            warna = scan.next().toUpperCase();
            System.out.print("NAMA KAMU : ");
            nama = scan.next();
        }
        
        private String menentukanKepribadian() {
            String warnaa = "Warna Favoritmu adalah ".concat(foreground);
            switch (this.warna) {
                case "MERAH" :
                    warnaa += String.join("", merah[1], merah[0], netral[0].concat("\n"), merah[2]);
                    break;
                case "HIJAU" :
                    warnaa += String.join("", hijau[1], hijau[0], netral[0].concat("\n"), hijau[2]);
                    break;
                case "KUNING" :
                    warnaa += String.join("", kuning[1], kuning[0], netral[0].concat("\n"), kuning[2]);
                    break;
                case "BIRU" :
                    warnaa += String.join("", biru[1], biru[0], netral[0].concat("\n"), biru[2]);
                    break;
                case "UNGU" :
                    warnaa += String.join("", ungu[1], ungu[0], netral[0].concat("\n"), ungu[2]);
                    break;
                default :
                    warnaa = "Oops.. Belum terindetifikasi";
            }
            return warnaa;
        }
    
        private void tampilTest() {
            System.out.println("===HASIL TEST KEPRIBADIAN " + nama + "===");
            System.out.println(menentukanKepribadian());
        }    
    
        public static void main(String[] args) {
            IF110119006Latihan29WarnaKepribadian data = new IF110119006Latihan29WarnaKepribadian();
            data.masukkanWarna();
            data.tampilTest();
        }   
}

