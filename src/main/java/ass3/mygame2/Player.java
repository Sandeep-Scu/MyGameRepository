package ass3.mygame2;


import java.util.ArrayList;


/**
 * This class is created for the reference of the player to give the directions.
 *
 * @author Sandeep
 * @version 2021.06.01
 */
public class Player
{
    
    private ArrayList<Item> playerItem;
    
    public Player()
    {
        playerItem = new ArrayList();
    }
    
    /**
    * This class is created for the reference of the player to give the directions.
    *
    * @param sandeep
    * @return 2021.06.01
    * @exception V1
    * @see 2021.06.01
    */
    
    public void addItemInventory(Item item){
        playerItem.add(item);
        System.out.println(item.getDescription() + " was taken ");
        //System.out.println(item.getDescription() + " was removed from the room"); // add extra information to inform user that the item has been taken
    }

    public void removeItemInventory(Item item){
        playerItem.remove(item);
        System.out.println(item.getName() + " was removed from your inventory");
    }
    
    public Item getPlayerItem(String stringItem){
        Item itemToReturn = null;
        for(Item item: playerItem){
            if(item.getName().contains(stringItem)){
                itemToReturn = item;
            }
        }
        return itemToReturn;
    }
    
    public String printAllInventory(){

        String returnString = "Items:";
        for(Item item : playerItem){
            returnString += " " + item.getName();           
        }
        return returnString;
    }

    
}
