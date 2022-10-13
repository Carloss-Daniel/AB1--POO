public class Payment {
    private IPaymentStrategy paymentStrategy;
  
    public Payment (IPaymentStrategy payment) {
      this.paymentStrategy = payment;
    }
  
    public void pay () {
      this.paymentStrategy.payment();
    }
  }
  
