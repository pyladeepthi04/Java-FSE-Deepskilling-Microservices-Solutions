package com.cognizant.junit;

public class FileProcessor {

    private FileReader fileReader;

    public FileProcessor(FileReader fileReader) {
        this.fileReader = fileReader;
    }

    public String processFile(String fileName) {
        return fileReader.readFile(fileName);
    }
}