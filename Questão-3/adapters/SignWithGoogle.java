package adapters;

import java.util.Optional;

import entities.User;
import ports.ISign;

/**
 * SignWithGoogle
 */
public class SignWithGoogle implements ISign{
  private GoogleProvider googleProvider;

  public SignWithGoogle (GoogleProvider googleProvider) {
    this.googleProvider = googleProvider;
  }

  @Override
  public User sign(Optional<String> email, Optional<String> password, Optional<Object> credentials) {
    try { 
      if (!credentials.isPresent()) {
        throw new Error ("Missing credentials error");
      }

      return this.googleProvider.sign(credentials);

    } catch (Exception e) {
      throw new Error(e);
    }
  }

  
}
