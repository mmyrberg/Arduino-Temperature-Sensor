package com.example.webservice.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class Temp {

    @Id
    @GeneratedValue
    protected Long Id;
    protected float temperature;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_date", updatable = false)
    protected Date created_date;

    public Temp(float temperature) {
        this.temperature = temperature;
    }
}
