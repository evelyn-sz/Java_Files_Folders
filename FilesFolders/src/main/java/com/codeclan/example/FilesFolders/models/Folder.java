package com.codeclan.example.FilesFolders.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "folders")
public class Folder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String title;

    @JsonIgnoreProperties({"folder"})
    @OneToMany(mappedBy = "folder")
    private List<File> files;

    @ManyToMany
    @JsonIgnoreProperties({"folders"})
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "folders_users",
            joinColumns = { @JoinColumn(
                    name = "folder_id",
                    nullable = false,
                    updatable = false
            )},
            inverseJoinColumns = {@JoinColumn(
                    name="user_id",
                    nullable = false,
                    updatable = false
            )}
    )
    private List<User> users;

    public Folder(String title) {
        this.title = title;
        this.files = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    public Folder(){};

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<File> getFiles() {
        return files;
    }

    public void addFile(File file){
        this.files.add(file);
    }

    public List<User> getUsers() {
        return users;
    }

    public void addUser(User user){
        this.users.add(user);
    }
}
