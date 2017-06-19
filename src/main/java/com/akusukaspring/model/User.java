package com.akusukaspring.model;

import com.akusukaspring.model.enums.Status;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Vincentius Dito on 04/06/2017.
 */

@Entity
@Table(name = "users")
public class User implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String fullname;
    private String telp;
    private String alamat;
    private String email;
    private String password;
    private String noKamar;
    private String jenisKamar;
    private Date expDate;
    private Status status;
    private String image;
    private Date created_at;
    private Date updated_at;
    private Date deleted_at;
    @ManyToOne
    private Role role;
    @ManyToOne
    private Kost penyewaKost;
    @OneToOne
    private Kost pemilikKost;
}
