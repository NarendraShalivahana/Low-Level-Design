class HDFCAdapter implements BankingService{
    public Integer checkBalance(){
        System.out.println("calling HDFC.balance()");
        return 200;
    }
    public String payToUpi(){
        System.out.println("calling HDFC.pay(ID)");
        return "Successful";
    }
    public List<String> history(){
        System.out.println("calling HDFC.history()")
        return List.of("a done 200","k done 100");
    }
    
}
