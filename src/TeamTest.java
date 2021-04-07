public class TeamTest {
    public static void main(String[] args){
        Integer playerListSize=Input.getInteger("Size of Player List: ");
        Team team=new Team(playerListSize);
        Integer option;
        Integer number;
        String name;
        do{
            System.out.println("0: Quit");
            System.out.println("1: Add a player");
            System.out.println("2: Display result");
            option=Input.getInteger("option: ");
            switch (option){
                case 0:
                    System.out.println("Quitting program now...");
                    break;
                case 1:
                    // no error checking assumes space available and player number is unique
                    number=Input.getInteger("number: ");
                    name=Input.getString("name: ");
                    team.addPlayer(number,name);
                    break;
                case 2:
                    System.out.println(team);
                    break;
                default:
                    System.out.println("Sorry invalid option");
            }
        }while(option!=0);
    }
}
