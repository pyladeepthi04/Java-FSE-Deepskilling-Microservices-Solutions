package com.cognizant.junit;

public class FileManager {

    private FileService fileService;

    public FileManager(FileService fileService) {
        this.fileService = fileService;
    }

    public void removeFile(String fileName) {
        fileService.deleteFile(fileName);
    }
}
