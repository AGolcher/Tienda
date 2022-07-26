/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.service;

import com.tienda.entity.Persona;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * @author Golcher
 * 
 */

public class Userprincipal implements UserDetails { //Guardar info del user

    private Persona persona;                        //Creo persona

    public Userprincipal(Persona persona) {
        this.persona = persona;                     //llamo a persona se le dice quien es
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {  // Por cada elemento se genera un Authority objeto nuevo "p"
        List<GrantedAuthority> authorities = new ArrayList<>();       // Granted Authority es un elemento que decide que permisos obtiene un user

// Extract list of permissions (name) 
        this.persona.getPermissionList().forEach(p -> {
            GrantedAuthority authority = new SimpleGrantedAuthority(p);
            authorities.add(authority);
        });

// Extract list of roles (ROLE_name) 
        this.persona.getRoleList().forEach(r -> {                                   //Buscamos lista roles y se lo pasamos
            GrantedAuthority authority = new SimpleGrantedAuthority("ROLE_" + r);   // Se pone "ROLE_" para identificar que es un rol
            authorities.add(authority);
        });
        return authorities;
    }

    @Override
    public String getPassword() {
        return this.persona.getPassword();
    }

    @Override
    public String getUsername() {
        return this.persona.getNombre();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return this.persona.getActive() == 1;
    }

}
