/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.service.api;

import com.tienda.model.ReporteVentasDTO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;

/**
 *
 * @author Golcher 
 */
public interface ReporteVentasServiceAPI {

    /**
     * @author <a href="agp@gmail.com">Austin Golcher</a>
     * @date 01 aug. 2022
     * @description
     * @HU_CU_REQ
     * @param params
     * @return
     */
    ReporteVentasDTO obtenerReporteVentas(Map<String, Object> params) throws JRException, IOException, SQLException;

}
