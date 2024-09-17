package br.com.etechoracio.study.exceptions;

public class DisponibilidadeNotFoundException extends RuntimeException {
    public DisponibilidadeNotFoundException(String mensagem) {
        super(mensagem);
    }
}
