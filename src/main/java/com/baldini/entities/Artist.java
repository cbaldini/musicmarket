package com.baldini.entities;

import com.baldini.enums.GendersEnum;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Artist {
    private Long id;
    private String name;
    private String surName;
    private String lastName;
    private Enum<GendersEnum> gender;

    @ManyToMany
    private List<Album> albums;
    @ManyToMany
    private List<Band> bands;
}
