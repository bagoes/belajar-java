package com.bagoes.javafundamental.filenavigation;

import java.io.File;

public class Main {
    public static void main(String[] agrs) {
        String dirname = "/java/latihan1";
        File file = null;
        String[] paths;

        try {
            // Instalasi objek fil
            file = new File(dirname);

            // Ambil list files da masukkan ke string paths
            paths = file.list();

            // Tampilkan semua path yang ada
            for (String path : paths) {
                System.out.println(path);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
