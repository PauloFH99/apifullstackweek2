package br.com.paulohenrique.myinvest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.paulohenrique.myinvest.domain.Investimento;

public interface InvestimentoRepository  extends JpaRepository<Investimento, Long>{

}
