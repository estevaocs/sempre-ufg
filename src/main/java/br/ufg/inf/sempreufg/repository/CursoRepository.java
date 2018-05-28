package br.ufg.inf.sempreufg.repository;

import br.ufg.inf.sempreufg.entity.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, String> {
    Curso findCursoByNome(String nome);
}
