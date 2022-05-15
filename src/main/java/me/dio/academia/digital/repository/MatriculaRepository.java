package me.dio.academia.digital.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import me.dio.academia.digital.entity.Matricula;

public interface MatriculaRepository extends JpaRepository<Matricula, Long>{

	/*
	@Query(value = "SELECT * FROM tb_matricula m "
			+ "INNER JOIN tb_alunos a ON m.aluno_id = a.id "
			+ "WHERE a.bairro = :bairro, nativeQuery = true")
	//@Query("FROM Matricula m WHERE m.aluno.bairro = :bairro")
	List<Matricula> findAlunosMatriculadosDoBairro(String bairro);
	*/
	
	List<Matricula> findByAlunoBairro(String bairro);
}
