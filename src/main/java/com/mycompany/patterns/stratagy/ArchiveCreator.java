package com.mycompany.patterns.stratagy;

public class ArchiveCreator {
    private Archivator archivator;

    public void setArchivator(Archivator archivator) {
        this.archivator = archivator;
    }

    public void createArchive(String str) {
        archivator.archive(str);
    }
}
