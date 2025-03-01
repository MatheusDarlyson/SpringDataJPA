package dio.aula_spring_data_jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dio.aula_spring_data_jpa.model.User;
import dio.aula_spring_data_jpa.repository.UserRepository;

@Component
public class ApplicationStarter implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("MATHEUS");
        user.setUsername("zululshot");
        user.setPassword("123mth");

        repository.save(user);

        for(User u: repository.findAll()){
            System.out.println(u);
        }
    }

}
