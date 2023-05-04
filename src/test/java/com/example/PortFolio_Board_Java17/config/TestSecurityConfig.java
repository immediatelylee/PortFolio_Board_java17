package com.example.PortFolio_Board_Java17.config;

import com.example.PortFolio_Board_Java17.domain.UserAccount;
import com.example.PortFolio_Board_Java17.repository.UserAccountRepository;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.event.annotation.BeforeTestMethod;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.given;

@Import(SecurityConfig.class)
public class TestSecurityConfig {

    @MockBean
    private UserAccountRepository userAccountRepository;

    @BeforeTestMethod
    public void securitySetUp() {
        given(userAccountRepository.findById(anyString())).willReturn(Optional.of(UserAccount.of(
                "lsgTest",
                "pw",
                "lsg-test@email.com",
                "lsg-test",
                "test memo"
        )));
    }

}
