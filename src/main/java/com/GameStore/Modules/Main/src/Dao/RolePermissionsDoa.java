package com.GameStore.Modules.Main.src.Dao;

import com.GameStore.Models.RolePermissions;
import com.GameStore.Models.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface RolePermissionsDoa extends CrudRepository<Roles,RolePermissions> {
}
