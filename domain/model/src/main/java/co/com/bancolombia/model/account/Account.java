package co.com.bancolombia.model.account;
import co.com.bancolombia.model.account.exceptions.BusinessException;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.Getter;
//import lombok.NoArgsConstructor;
import lombok.Setter;

import static co.com.bancolombia.model.account.exceptions.message.BusinessErrorMessage.CHANNEL_FIND_ALL_ERROR;

@Getter
@Setter
//@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Account {

    private final long id;
    private final String name;
    private String status;

    public static  Account newAccount(long id, String name, String status){
        if(name.equals("error"))
            throw  new BusinessException(CHANNEL_FIND_ALL_ERROR);
        return  new Account(id, name, status);
    }
}
