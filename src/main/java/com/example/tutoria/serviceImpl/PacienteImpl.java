package com.example.tutoria.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tutoria.model.Paciente;
import com.example.tutoria.repository.PacienteRepository;
import com.example.tutoria.service.PacienteService;

@Service
public class PacienteImpl implements PacienteService{
@Autowired

private PacienteRepository pacienteRepository;

@Override
public Paciente create(Paciente paciente) {
	// TODO Auto-generated method stub
	return pacienteRepository.save(paciente);
}

@Override
public List<Paciente> readAll() {
	// TODO Auto-generated method stub
	return pacienteRepository.findAll();
}

@Override
public Paciente read(Long id) {
	// TODO Auto-generated method stub
	return pacienteRepository.findById(id).get();
}

@Override
public void delete(Long id) {
	// TODO Auto-generated method stub
	pacienteRepository.deleteById(id);
}

@Override
public Paciente update(Paciente pc) {
	// TODO Auto-generated method stub
	return pacienteRepository.save(pc);
}
}
