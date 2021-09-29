package com.example.tutoria.service;

import com.example.tutoria.model.Paciente;

import java.util.List;

public interface PacienteService {
	Paciente create(Paciente paciente);
	List<Paciente> readAll();
	Paciente read(Long id);
	void delete(Long id);
	Paciente update(Paciente pc);
}
