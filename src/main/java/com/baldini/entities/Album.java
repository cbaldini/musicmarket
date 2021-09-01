package com.baldini.entities;

import com.baldini.enums.GendersEnum;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Album {
    private Long id;
    private String title;
    @ManyToMany
    private List <Artist> artists;
    private Enum<GendersEnum> gender;
    private int year;
    private int tracksNumber;
    private List<String> tracks;
}
