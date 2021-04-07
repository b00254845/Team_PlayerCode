public class Player {
    private Integer number;
    private String name;
    
    public Player(Integer number,String name){
        this.number=number;
        this.name=name;
    }
    
    public String toString(){
        return this.number+" "+this.name;
    }
}
