package animals;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

    @Configuration
    public class Config {

        @Bean()
        public Lion lion() {
            return new Lion();
        }

        @Bean()
        public Wolf wolf() {
            return new Wolf();
        }

        @Bean()
        public Eagle eagle() {
            return new Eagle();
        }
    }













