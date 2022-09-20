public class GameManager {
    // innehåller logiken för spelet
    private int cash;
    private GameManager(){

    }
    static GameManager instance=  new GameManager() ;
    public static GameManager getInstance(){
        return instance ;
    }
    public int GetCash() {
        return cash;
    }

    public void AddCash(int amount) {
        cash += amount;
    }

    public void NewGame() {
        // välj bil
        PlayerVehicle vehicle = new PlayerVehicle("Sedan", 5, 70, 4) ;
        // skapa player objekt
        Player player = new Player(100, vehicle) ;
        player.setName("Player");
        // skapa spelscener
        // loopar det här...
        while(player.IsAlive()){
            // generera gameobjekt typ sideobjcts, traffic m.m.

            // spelare kör bilen


            //Kollidera med andra objekt


            // Repetera tills hälsa är = 0
        }
       EndGame();
    }

    public void EndGame() {
        System.out.printf("Total cash accumulated : %d", cash);
    }
}
