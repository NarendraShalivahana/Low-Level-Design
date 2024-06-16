// phonePe class can be connected by any adapter that we pass, fetches data calling adapters, which further calls respective 3rd party API's in this case HDFC and ICIC
class phonePe{
    public BankingService API;
    phonePe(BankingService a){
        this.API=a;
    }
    public  Integer getBal(){
        return this.API.checkBalance();
    }
    public  String pay(){
        return this.API.payToUpi();
    }
    public List<String> gethis(){
        return this.API.history();
    }
    
}
//Test
public class Main {
    public static void main(String[] args) {
        BankingService a=new ICICAdapter();
        phonePe p=new phonePe(a);
        System.out.print(p.getBal());
        System.out.print(p.gethis());
        
        BankingService b=new HDFCAdapter();
        phonePe q=new phonePe(b);
        System.out.print(q.getBal());
        System.out.print(q.pay());
    }
}
