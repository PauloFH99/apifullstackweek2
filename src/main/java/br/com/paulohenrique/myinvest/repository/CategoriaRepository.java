package br.com.paulohenrique.myinvest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.paulohenrique.myinvest.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria,Long>{

}
