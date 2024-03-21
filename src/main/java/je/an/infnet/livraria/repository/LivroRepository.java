package je.an.infnet.livraria.repository;

import je.an.infnet.livraria.entity.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository  extends JpaRepository<Livro, Long> {
}
