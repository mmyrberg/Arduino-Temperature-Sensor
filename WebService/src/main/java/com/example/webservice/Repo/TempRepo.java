package com.example.webservice.Repo;

import com.example.webservice.Model.Temp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TempRepo extends JpaRepository <Temp, Long> {
}
