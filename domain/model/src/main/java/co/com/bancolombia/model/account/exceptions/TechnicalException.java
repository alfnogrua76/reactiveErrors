package co.com.bancolombia.model.account.exceptions;


import co.com.bancolombia.model.account.exceptions.message.TechnicalErrorMessage;

public class TechnicalException extends RuntimeException{
    private final TechnicalErrorMessage technicalErrorMessage;

    public TechnicalException(TechnicalErrorMessage technicalErrorMessage) {
        super(technicalErrorMessage.getMessage());
        this.technicalErrorMessage = technicalErrorMessage;
    }
}
