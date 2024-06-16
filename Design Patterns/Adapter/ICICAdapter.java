class ICICAdapter implements BankingService{
    public Integer checkBalance(){
        System.out.println("calling ICIC.getBalance()");
        return 100;
    }
    public String payToUpi(){
        System.out.println("calling ICIC.payingTO(ID)");
        return "Successful";
    }
    public List<String> history(){
        System.out.println("calling ICIC.getHistory()");
        return List.of("100 done to k","200 done to J");
    }
    
}
