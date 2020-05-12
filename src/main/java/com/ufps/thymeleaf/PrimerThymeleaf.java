/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufps.thymeleaf;

import javax.servlet.ServletContext;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;


/**
 *
 * @author Juan José
 */

public class PrimerThymeleaf {
    

    private final TemplateEngine templateEngine;

    public PrimerThymeleaf(final ServletContext ctx) {

        ServletContextTemplateResolver templateResolver = new ServletContextTemplateResolver(ctx);
        templateResolver.setTemplateMode(TemplateMode.HTML);
        templateResolver.setPrefix("/WEB-INF/templates/");
        templateResolver.setSuffix(".html");
        
        // tiempo en cache
        templateResolver.setCacheTTLMs(3600000L);
        
        // desactivar la cache, true para activarla
        templateResolver.setCacheable(false);

        templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(templateResolver);
    }

    public TemplateEngine getTemplateEngine() {
        return templateEngine;
    }
}
