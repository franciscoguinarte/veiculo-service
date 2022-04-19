package com.service

import com.model.Veiculo
import com.repository.VeiculoRepository
import jakarta.inject.Singleton
import java.util.*

@Singleton
class VeiculoService

    (private val veiculoRepository: VeiculoRepository)
{
    fun create(veiculo: Veiculo): Veiculo{
        return veiculoRepository.save(veiculo);
    }
    fun findById(id: Long): Veiculo {
        return veiculoRepository.findById(id).get();
    }
}