package adapters;

import java.util.Optional;

import entities.User;
import ports.HttpClient;
import ports.ISign;

public class SignWithForm implements ISign {

  private HttpClient<User> httpClient;

  public SignWithForm (HttpClient httpClient) {
    this.httpClient = httpClient;
  }

  @Override
  public User sign(Optional<String> email, Optional<String> password, Optional<Object> credentials) {
    try { 
      if(email.isEmpty() || password.isEmpty()){
        throw new Error("Missing params error");
      }

      return httpClient.fetch("localhost:3000/api/sign");

    }catch (Exception e){
      throw new Error(e);
    }
  }
  
}
