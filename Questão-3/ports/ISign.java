package ports;

import java.util.Optional;
import entities.User;

public interface ISign {
  public User sign(Optional<String> email, Optional<String> password, Optional<Object> credentials);
}
