package com.upc.stayinggood.Service;

import com.upc.stayinggood.DTOs.ConsumoCaloriasDTO;
import com.upc.stayinggood.Entities.RegistroConsumo;

import java.util.List;

public interface RegistroConsumoService {
    public List<RegistroConsumo> obtenerRegistroConsumo();
    public RegistroConsumo insertarRegistroConsumo(RegistroConsumo registroConsumo);
    public RegistroConsumo actualizarRegistroConsumo(RegistroConsumo registroConsumo);
    public List<ConsumoCaloriasDTO> totalConsumo();
}
