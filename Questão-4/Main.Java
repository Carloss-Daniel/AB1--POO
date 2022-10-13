public class Main {
    public static void main(String[] args) {
           IPaymentStrategy Pix = new Pix();
           Payment payment = new Payment(Pix);
           payment.pay();
        };
        
    }
