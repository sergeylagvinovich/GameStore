package com.GameStore.Models;


import javax.management.relation.Role;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "modules")
public class Modules {

    public Modules ( ) {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @OneToMany(mappedBy = "module")
    private Set<RolePermissions> moduleRoles;

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

    public Set<RolePermissions> getModuleRoles ( ) {
        return moduleRoles;
    }

    public void setModuleRoles ( Set<RolePermissions> moduleRoles ) {
        this.moduleRoles = moduleRoles;
    }
}
