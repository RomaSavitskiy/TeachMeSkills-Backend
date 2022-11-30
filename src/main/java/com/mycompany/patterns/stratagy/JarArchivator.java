package com.mycompany.patterns.stratagy;

public class JarArchivator implements Archivator{
    @Override
    public void archive(String str) {
        System.out.println("We create jaf from " + str);
    }
}
