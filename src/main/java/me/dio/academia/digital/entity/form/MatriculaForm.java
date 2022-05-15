package me.dio.academia.digital.entity.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MatriculaForm {

	@NotNull(message = "Preencha o campo corretamente.")
	@Positive(message = "O ID do aluno deve ser um número positivo.")
	private Long alunoId;

}
