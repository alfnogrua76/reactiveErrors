package co.com.bancolombia.usecase.registeraccount;

import co.com.bancolombia.model.account.Account;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class RegisterAccountUseCase {

    private Mono<String> legalValidation(String accountName){
        return Mono.just(accountName);
    }

    private Mono<Integer> disponibilityValidation(){
        return Mono.just(9);
    }

    private Mono<String> getStatus(String accountName){
        return Mono.just("Ok");
    }

    private Mono<Account> finalValidation(Account account){
        return Mono.just(account);
    }

    private Mono<Account> saveValidation(Account account){
        return Mono.just(account);
    }
}
