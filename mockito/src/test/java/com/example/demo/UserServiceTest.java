package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @Test
    void shouldReturnWelcomeMessageForExistingUser() {
        // Arrange
        User fakeUser = new User("Alex");
        when(userRepository.findById(1L)).thenReturn(fakeUser);

        // Act
        String message = userService.getWelcomeMessage(1L);

        // Assert
        assertEquals("Welcome back, Alex!", message);
        verify(userRepository).findById(1L);
    }
}