package com.elm.tajseer.tajseer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Faculty {
    @Id
    private int id_fclty;
    @Column
    private String name_fclty;
    @Column
    private String email_fclty;


    public int getId_fclty(int i) {
        return id_fclty;
    }

    public void setId_fclty(int id_fclty) {
        this.id_fclty = id_fclty;
    }

    public String getName_fclty(String ah) {
        return name_fclty;
    }

    public void setName_fclty(String name_fclty) {
        this.name_fclty = name_fclty;
    }

    public String getEmail_fclty(String s) {
        return email_fclty;
    }

    public void setEmail_fclty(String email_fclty) {
        this.email_fclty = email_fclty;
    }


}


