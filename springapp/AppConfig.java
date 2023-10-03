import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Student student() {
        Student student = new Student();
        student.setStudentid(1);
        student.setFirstName("Avishkar");
        student.setLastName("Mane");
        return student;
    }
}