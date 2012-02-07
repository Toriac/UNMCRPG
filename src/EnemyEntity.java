import java.util.ArrayList;


public class EnemyEntity extends RPGEntity {
	/* Vars */
	private String enemyType;
	private ArrayList<Item> drops = new ArrayList<Item>();
	
	
	/* Methods */
	//Do some ability.
	public void doSpecialAbility(RPGEntity target){
		//Logic for doing special ability.
	}
	
	//Drop item based on ID
	public Item dropItem(int dropID){
		//Serialized goodness
		if(this.drops[dropID] != null ){
			return this.drops[dropID];
		}
		else{
			return false;
		}
	}
	
	//Drop a random item. Partyhard.js.
	public Item dropRandomItem(){
		int randNum = Math.round(Math.random() * drops.length);
		return this.drops[randNum];
	}
	
}
