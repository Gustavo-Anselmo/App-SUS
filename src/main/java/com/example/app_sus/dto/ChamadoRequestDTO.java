package com.example.app_sus.dto;

import com.example.app_sus.model.Endereco; // Ou EnderecoDTO
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.NotBlank;

public class ChamadoRequestDTO {

    @NotNull(message = "ID do Paciente é obrigatório")
    private Long pacienteId;

    // O ID do usuário será tratado no backend (pego do usuário autenticado).
    // Não precisamos recebê-lo do formulário de criação de chamado por segurança.
    // private Long usuarioId; 

    @NotBlank(message = "Sintomas são obrigatórios")
    private String sintomas;

    private String observacoesAdicionais;

    @NotNull(message = "Endereço de atendimento é obrigatório")
    @Valid // Para validar os campos dentro de Endereco
    private Endereco enderecoAtendimento;

    // Getters e Setters
    public Long getPacienteId() { return pacienteId; }
    public void setPacienteId(Long pacienteId) { this.pacienteId = pacienteId; }

    public String getSintomas() { return sintomas; }
    public void setSintomas(String sintomas) { this.sintomas = sintomas; }

    public String getObservacoesAdicionais() { return observacoesAdicionais; }
    public void setObservacoesAdicionais(String observacoesAdicionais) { this.observacoesAdicionais = observacoesAdicionais; }

    public Endereco getEnderecoAtendimento() { return enderecoAtendimento; }
    public void setEnderecoAtendimento(Endereco enderecoAtendimento) { this.enderecoAtendimento = enderecoAtendimento; }
}