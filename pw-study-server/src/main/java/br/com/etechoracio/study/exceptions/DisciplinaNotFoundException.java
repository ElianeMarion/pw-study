package br.com.etechoracio.study.exceptions;

public class DisciplinaNotFoundException extends RuntimeException {
    public DisciplinaNotFoundException(String mensagem) {
        super(mensagem);
    }
}
