package com.GameStore.Models.Associations;

import javax.persistence.Embeddable;
import java.io.Serializable;
@Embeddable
public class RolePermissionsId implements Serializable {

    private Integer role;

    private Integer module;

    public Integer getRole ( ) {
        return role;
    }

    public void setRole ( Integer role ) {
        this.role = role;
    }

    public Integer getModule ( ) {
        return module;
    }

    public void setModule ( Integer module ) {
        this.module = module;
    }

    public int hashCode() {
        return (int)(role + module);
    }

    public boolean equals(Object object) {
        if (object instanceof RolePermissionsId) {
            RolePermissionsId otherId = (RolePermissionsId) object;
            return (otherId.role == this.role)
                    && (otherId.module == this.module);
        }
        return false;
    }
}
