package br.edu.ifal.gerenciador_lembretes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioConvidados extends JpaRepository<Convidado, Long> {

}