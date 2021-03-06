package gateway.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.CorsRegistry;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.config.WebFluxConfigurer;

@Configuration
@EnableWebFlux
public class WebConfig implements WebFluxConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {

        registry.addMapping("/**")
                .allowedOriginPatterns("*") // any host or put domain(s) here
                .allowedMethods("GET","POST","PUT","DELETE") // put the http verbs you want allow
                .allowedHeaders("*") // put the http headers you want allow
                .allowCredentials(true);

    }
}