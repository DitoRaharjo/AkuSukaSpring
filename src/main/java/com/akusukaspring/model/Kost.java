package com.akusukaspring.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Vincentius Dito on 06/06/2017.
 */

@Entity
@Table(name = "kosts")
public class Kost implements Serializable{
    @Id
    @GeneratedValue
    private Long id;
    private String nama;
    private String alamat;
    private String image;
    private Date created_at;
    private Date updated_at;
    private Date deleted_at;
    @OneToMany
    private List<User> penyewaKost;
    @OneToOne
    private User pemilikKost;
}
