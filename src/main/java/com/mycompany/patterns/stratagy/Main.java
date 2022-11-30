package com.mycompany.patterns.stratagy;

public class Main {
    public static final String ZIP = "zip";
    public static final String JAR = "jar";
    private static final ArchiveCreator creator = new ArchiveCreator();

    public static void main(String[] args) {
        /*ArchiveCreator creator = new ArchiveCreator();
        creator.setArchivator(new ZipArchivator());
        creator.createArchive("MyVestArchive");
        creator.setArchivator(new JarArchivator());
        creator.createArchive("MyNextBestZipArchive");*/

        createArchiveByType(ZIP, "MyBestFileFirst");
        createArchiveByType(JAR, "MyBestFileSecond");
    }


    private static void createArchiveByType(String type, String message) {
        if (JAR.equals(type)) {
            creator.setArchivator(new JarArchivator());
        } else if (ZIP.equals(type)) {
            creator.setArchivator(new ZipArchivator());
        }

        creator.createArchive(message);
    }
}
