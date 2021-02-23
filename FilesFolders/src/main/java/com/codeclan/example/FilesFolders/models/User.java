package com.codeclan.example.FilesFolders.models;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;

    private List<File> files;

    public User(String name) {
        this.name = name;
        this.files = new ArrayList<>();
    }

    public User(){};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public void addFile(File file){
        this.files.add(file);
    }
}
