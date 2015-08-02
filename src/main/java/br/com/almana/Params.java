package br.com.almana;

import br.com.almana.binding.annotations.JdbcUrl;
import com.google.inject.Inject;
import com.google.inject.name.Named;

public class Params {

    private String jdbcUrl;
    private Integer containerPort;

    @Inject
    public Params(@Named("containerPort") Integer containerPort, @JdbcUrl String jdbcUrl) {
        this.containerPort = containerPort;
        this.jdbcUrl = jdbcUrl;
    }

    public Integer getContainerPort() {
        return containerPort;
    }

    public String getJdbcUrl() {
        return jdbcUrl;
    }
}
