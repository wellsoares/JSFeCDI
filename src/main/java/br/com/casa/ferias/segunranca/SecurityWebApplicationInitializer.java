package br.com.casa.ferias.segunranca;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 *
 * @author well
 */
public class SecurityWebApplicationInitializer
        extends AbstractSecurityWebApplicationInitializer {

    public SecurityWebApplicationInitializer() {
        super(SecurityConfig.class);
    }
}
