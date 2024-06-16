// These are the two classes called by respective bank Adapters to get data and work done
class ICIC{
    public Integer getBalance();
    public String payingTo(Integer ID);
    public List<String> history();
    
}
