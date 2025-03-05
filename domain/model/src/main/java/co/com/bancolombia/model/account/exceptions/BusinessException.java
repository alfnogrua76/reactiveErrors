package co.com.bancolombia.model.account.exceptions;


import co.com.bancolombia.model.account.exceptions.message.BusinessErrorMessage;
import lombok.Getter;

@Getter
public class BusinessException extends RuntimeException{

    private final BusinessErrorMessage businesserrorMessage;

    public BusinessException(BusinessErrorMessage businesserrorMessage) {
        super(businesserrorMessage.getMessage());
        this.businesserrorMessage = businesserrorMessage;
    }
}
