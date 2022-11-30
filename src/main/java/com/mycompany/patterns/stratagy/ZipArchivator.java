package com.mycompany.patterns.stratagy;

public class ZipArchivator implements Archivator{
    @Override
    public void archive(String str) {
        System.out.println("We create zip from " + str);
    }
}
