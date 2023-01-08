package br.com.bruno.system.core.usecase.validation;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.MockitoAnnotations.openMocks;

import br.com.bruno.system.core.domain.ValidVote;
import br.com.bruno.system.dataprovider.exception.SessionAlredyCloseExeption;
import java.time.LocalDateTime;
import java.time.Month;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

class SessionOpenValidationTest {

  @InjectMocks
  private SessionOpenValidation sessionOpenValidation;
  private AutoCloseable closeable;

  @BeforeEach
  public void setup() {
    this.closeable = openMocks(this);
  }

  @Test
  void doesThowSessionAlredyCloseExeption() {

    assertThrows(SessionAlredyCloseExeption.class, () -> this.sessionOpenValidation.check(this.createVote()));
  }

  @AfterEach
  public void releaseMocks() throws Exception {
    this.closeable.close();
  }

  private ValidVote createVote() {
    return new ValidVote(1L,
        1L,
        LocalDateTime.now(),
        LocalDateTime.of(LocalDateTime.MIN.getYear(), Month.APRIL, 10, 10, 0),
        10);
  }
}