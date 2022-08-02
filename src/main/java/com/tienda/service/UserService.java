/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.service;

import com.tienda.entity.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author Golcher SI AFECTA EL SPRINGSECURITY LO TOMA EN CUENTA, SIRVE PARA
 * VALIDAD SI USER EXISTE O NO Y SI PUEDE LOGEAR O NO!
 */
@Service
public class UserService implements UserDetailsService {

    @Autowired
    public IPersonaService personaService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Persona persona = this.personaService.findByNombre(username);                           //retorna toda la linea del buscado 
        Userprincipal userPrincipal = new Userprincipal(persona);
        return userPrincipal;
    }
}
