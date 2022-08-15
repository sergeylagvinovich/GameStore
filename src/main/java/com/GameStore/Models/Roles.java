package com.GameStore.Models;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "roles")
public class Roles {

    public Roles ( ) {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @OneToMany(mappedBy = "role")
    private Set<RolePermissions> rolesModules;

    public Integer getId ( ) {
        return id;
    }

    public void setId ( Integer id ) {
        this.id = id;
    }

    public String getName ( ) {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public Set<RolePermissions> getRolesModules ( ) {
        return rolesModules;
    }

    public void setRolesModules ( Set<RolePermissions> rolesModules ) {
        this.rolesModules = rolesModules;
    }
}
