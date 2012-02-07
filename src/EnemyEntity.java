
public class EnemyEntity extends RPGEntity {
	/* Vars */
	private String enemyType;
	private Item[] drops = new Item[];
	
	/* Vars */
	//Do some ability.
	public void doSpecialAbility(RPGEntity target){
		//Logic for doing special ability.
	}
	
	//Drop item based on ID
	public Item dropItem(int dropID){
		//Serialized goodness
		if(this.drops[dropID] != null){
			return this.drops[dropID];
		}
		else{
			return false;
		}
	}
	
	
	public Item dropRandomItem(){
		int randNum = Math.round(Math.random() * drops.length);
		return this.drops[randNum];
	}
	
}
