package ass3.mygame2;

import java.util.ArrayList;


/**
 * The class "ItemCreation" is created to describe the items such as frontGatekey, key etc.
 *
 * @author Sandeep
 * @version 2021.06.01
 */
public class ItemCreation
{
    
    private ArrayList<Item> allItemsInGame;
    
    public ItemCreation()
    {       
        allItemsInGame = new ArrayList();
        createItems();
    }
    
    public void createItems(){
        
        Item item1, item2, excaliburSword, key, frontGateKey;
        
        
        excaliburSword = new Item("excaliburSword", "The legendary Excalibur", 100);
        key = new Item("key", "It has a shape of a heart", 100);
        frontGateKey = new Item("frontGateKey", "To open the front gate door", 100);
        
        allItemsInGame.add(excaliburSword);
        allItemsInGame.add(key);
        allItemsInGame.add(frontGateKey);
    }
   
    public Item getItem(String stringItem){
        Item itemToReturn = null;
        for(Item item: allItemsInGame){
            if(item.getName().contains(stringItem)){
                itemToReturn = item;
            }
        }
        return itemToReturn;
    }
  
    
}
