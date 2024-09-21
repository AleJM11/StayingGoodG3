package com.upc.stayinggood.Service;

import com.upc.stayinggood.Entities.Service;

import java.util.List;

public interface ServicesService {
    public List<Service> obtenerServices();
    public Service insertarService  (Service service);
}
