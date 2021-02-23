package com.codeclan.example.filesfolders.components.models;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;

    private List<Folder> folders;

    public User(String name) {
        this.name = name;
        this.folders = new ArrayList<>();
    }

    public User(){};

    public void addFolder(Folder folder){
        this.folders.add(folder);
    }

    public List<Folder> getFolders(){
        return folders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
