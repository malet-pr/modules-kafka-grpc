package com.example.persistence.model;

import java.util.Date;
import java.util.UUID;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="NOTE")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Note{
    @Id
    @GeneratedValue
    private UUID noteId;
    private String text;
    private Date date;
}
