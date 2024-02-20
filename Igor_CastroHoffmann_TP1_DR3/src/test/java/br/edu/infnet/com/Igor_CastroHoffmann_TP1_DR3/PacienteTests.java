package br.edu.infnet.com.Igor_CastroHoffmann_TP1_DR3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.com.Igor_CastroHoffmann_TP1_DR3.model.domain.Paciente;

@SpringBootTest
public class PacienteTests {
	
	private Paciente paciente;
	
	@BeforeEach
	void setUp() {
		paciente = new Paciente();
		paciente.setNome(null);
		paciente.setCpf(null);
		paciente.setDataNascimento(null);
		paciente.setCep(0);
		paciente.setNumeroCasa(0);
	}
	
	@Test
	void recuperarDados() {
		assertEquals(null, paciente.getNome());
		assertEquals(null, paciente.getCpf());
		assertEquals(null, paciente.getDataNascimento());
		assertEquals(0, paciente.getCep());
		assertEquals(0, paciente.getNumeroCasa());
	}
	
}
