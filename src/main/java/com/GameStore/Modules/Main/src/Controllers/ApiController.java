package com.GameStore.Modules.Main.src.Controllers;

import com.GameStore.Models.Modules;
import com.GameStore.Models.RolePermissions;
import com.GameStore.Models.Roles;
import com.GameStore.Modules.Main.src.Dao.ModulesDao;
import com.GameStore.Modules.Main.src.Dao.RolePermissionsDoa;
import com.GameStore.Modules.Main.src.Dao.RolesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.management.relation.Role;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

@RestController
@RequestMapping("webApi/administration")
public class ApiController {


    @Autowired
    private RolesDao rolesDao;
    @Autowired
    private ModulesDao modulesDao;

    @Autowired
    private RolePermissionsDoa rolePermissionsDoa;
    @GetMapping
    @Transactional
    public void getGames(){
        Roles r = new Roles ();
        r.setName ("role 1");
        r = rolesDao.save (r);
        Modules m1 = new Modules ();
        m1.setName ("module 1");
        m1 = modulesDao.save (m1);

        Modules m2 = new Modules ();
        m2.setName ("module 2");
        m2 = modulesDao.save (m2);

        RolePermissions rp1 = new RolePermissions ();
        rp1.setModule (m1);
        rp1.setRole (r);

        RolePermissions rp2 = new RolePermissions ();
        rp2.setModule (m2);
        rp2.setRole (r);

        r.setRolesModules (new HashSet<> (){{add (rp1);add (rp2);}});
        rolesDao.save (r);

    }
}
