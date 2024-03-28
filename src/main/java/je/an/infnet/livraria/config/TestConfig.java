package je.an.infnet.livraria.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import je.an.infnet.livraria.entity.Autor;
import je.an.infnet.livraria.entity.Livro;
import je.an.infnet.livraria.repository.AutorRepository;
import je.an.infnet.livraria.repository.LivroRepository;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
    @Autowired
    private LivroRepository livroRepository;
    @Autowired
    private AutorRepository autorRepository;

    @Override
    public void run(String... args) throws Exception {

        Autor a1 = new Autor(null, "Howard Phillips Lovecraft");
        Autor a2 = new Autor(null, "Cormac McCarthy");

        autorRepository.saveAll(Arrays.asList(a1,a2));

        Livro l1 = new Livro(null,"Call of Cthulhu",a1);
        Livro l2 = new Livro(null,"Blood Meridian",a2);

        livroRepository.saveAll(Arrays.asList(l1,l2));
    }
}