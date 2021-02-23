package com.codeclan.example.FilesFolders.repositories;

import com.codeclan.example.FilesFolders.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
