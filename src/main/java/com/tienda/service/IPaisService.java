/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.service;

import com.tienda.entity.Pais;
import java.util.List;

/**
 *
 * @author Golcher
 */
public interface IPaisService {

    
    public List<Pais> listCountry();
    public Pais getPaisById(long id);
    public void savePais(Pais pais);
    public void delete(long id);

}
