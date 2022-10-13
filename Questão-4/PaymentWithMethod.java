public class PaymentWithMethod {
    private IPaymentStrategy paymentStrategy;
  
    public PaymentWithMethod () {}
    
    public void setStrategy(IPaymentStrategy strategy) {
      this.paymentStrategy = strategy;
    } 
  
    public void pay () {
      this.paymentStrategy.payment();
    }
  }
  
