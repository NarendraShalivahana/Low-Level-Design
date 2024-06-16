//Bankingservice must implemented by all adapters
interface BankingService{
    public Integer checkBalance();
    public String payToUpi();
    public List<String> history();
}
