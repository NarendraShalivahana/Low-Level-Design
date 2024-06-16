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
