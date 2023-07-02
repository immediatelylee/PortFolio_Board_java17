package com.example.PortFolio_Board_Java17.config;

import com.example.PortFolio_Board_Java17.domain.UserAccount;
import com.example.PortFolio_Board_Java17.dto.UserAccountDto;
import com.example.PortFolio_Board_Java17.repository.UserAccountRepository;
import com.example.PortFolio_Board_Java17.service.UserAccountService;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.event.annotation.BeforeTestMethod;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.given;

@Import(SecurityConfig.class)
public class TestSecurityConfig {

    @MockBean private UserAccountService userAccountService;

    @BeforeTestMethod
    public void securitySetUp() {
        given(userAccountService.searchUser(anyString()))
                .willReturn(Optional.of(createUserAccountDto()));
        given(userAccountService.saveUser(anyString(), anyString(), anyString(), anyString(), anyString()))
                .willReturn(createUserAccountDto());
    }


    private UserAccountDto createUserAccountDto() {
        return UserAccountDto.of(
                "lsgTest",
                "pw",
                "lsg-test@email.com",
                "lsg-test",
                "test memo"
        );
    }

}
