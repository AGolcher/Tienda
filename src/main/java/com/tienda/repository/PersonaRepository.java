/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.repository;

import com.tienda.entity.Persona;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype

/**
 *
 * @author Golcher
 */
public interface PersonaRepository extends CrudRepository<Persona, Long> {

}
