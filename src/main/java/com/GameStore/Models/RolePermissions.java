package com.GameStore.Models;

import com.GameStore.Models.Associations.RolePermissionsId;

import javax.persistence.*;

@Entity
@Table(name = "role_permissions")
@IdClass (RolePermissionsId.class)
public class RolePermissions {

    public RolePermissions ( ) {
    }

    @Id
    @ManyToOne
    @JoinColumn(name = "role_id", referencedColumnName = "id")
    private Roles role;

    @Id
    @ManyToOne
    @JoinColumn(name = "module_id", referencedColumnName = "id")
    private Modules module;

    @Column
    private Boolean can_view;
    @Column
    private Boolean can_create;
    @Column
    private Boolean can_update;
    @Column
    private Boolean can_delete;

    public Boolean getCan_view ( ) {
        return can_view;
    }

    public void setCan_view ( Boolean can_view ) {
        this.can_view = can_view;
    }

    public Boolean getCan_create ( ) {
        return can_create;
    }

    public void setCan_create ( Boolean can_create ) {
        this.can_create = can_create;
    }

    public Boolean getCan_update ( ) {
        return can_update;
    }

    public void setCan_update ( Boolean can_update ) {
        this.can_update = can_update;
    }

    public Boolean getCan_delete ( ) {
        return can_delete;
    }

    public void setCan_delete ( Boolean can_delete ) {
        this.can_delete = can_delete;
    }

    public Roles getRole ( ) {
        return role;
    }

    public void setRole ( Roles role ) {
        this.role = role;
    }

    public Modules getModule ( ) {
        return module;
    }

    public void setModule ( Modules module ) {
        this.module = module;
    }

}
