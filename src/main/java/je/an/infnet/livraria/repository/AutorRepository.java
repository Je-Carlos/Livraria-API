package je.an.infnet.livraria.repository;

import je.an.infnet.livraria.entity.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Long> {
}
