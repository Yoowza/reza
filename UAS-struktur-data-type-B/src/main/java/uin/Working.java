package uin;

import java.util.*;

/**
 * ini adalah class yang menjadi tempat kalian mengerjakan soal ujian kalian
 */
public class Working {
    /**
     * @return harus dapat mengembalikan nilai sebuah list 2 dimensi yang terdiri dari 10 entry/baris dan 3 colom
     */
    public static List<List<String>> createAListsTest() {
        List<List<String>> result = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            result.add(List.of("Item" + i, "Detail" + i, "Extra" + i));
        }
        return result;
    }

    /**
     * anda harus dapat mengurutkan data yang di berikan, berdasarkan nama pekerjaan
     *
     * @param data data berbentuk seperti data cari @see createAListTest() 10 baris dan 2 column
     * @return mengembalikan data yang sudah di urutkan
     */
    public static List<List<String>> sortTest(List<List<String>> data) {
        data.sort(Comparator.comparing(o -> o.get(1)));
        return data;
    }

    /**
     * anda harus dapat membalikkan sebuah nilai string
     * contoh jawa menjadi awaj dan doleh menjadi helod
     *
     * @param data berupa string
     * @return berupa nilai string yang sudah dibalik
     */
    public static String stackTest(String data) {
        Stack<Character> stack = new Stack<>();
        for (char c : data.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }

    /**
     * Selesaikan fungsi queue_test yang menerima list angka merepresentasikan waktu layanan pelanggan di
     * dua kasir. Fungsi harus mengembalikan list (yang berukuran 2 [kasir1, kasir2]) waktu total layanan kedua kasir.
     *
     * @param data adalah list waktu tiap pelangan
     * @return sebuah list berukuran 2 yang terdiri dari [kasir1, kasir2]
     */
    public static List<Integer> queueTest(List<Integer> data) {
        int kasir1 = 0;
        int kasir2 = 0;

        for (int waktu : data) {
            if (kasir1 <= kasir2) {
                kasir1 += waktu;
            } else {
                kasir2 += waktu;
            }
        }
        return List.of(kasir1, kasir2);
    }
}
