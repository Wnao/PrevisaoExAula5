package br.usjt.hellospringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.hellospringboot.model.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {

	public Cidade findByLatitudeAndLongitude (Double latitude, Double longitude); 
	public Cidade findByNome (String nome);
	public Cidade findByNomeIgnoreCase (String nome);
	

}
