
public class RPGEntity {

	/* Vars */
	private int entityID;
	private int level;
	private Buff[] buffs = new Buff[];
	private Debuff[] debuffs = new Debuff[];
	private HitPoints hitpoints = new Hitpoints;
	private Resource resources = new Resource;
	private Statistic[] statistics = new Statistics[];
	private Skill[] abilities = new Skill[];
	
	/* Methods */
	//Attack target entity.
	public void attack(RPGEntity target){
		//Logic containing attack information.
	}
	
	//Heal entity.
	public void heal(int healAmt){
		this.hitpoints.increase(healAmt);
	}
	
	//Set statistic of entity.
	public void setStat(Statistic stat, int changeAmt){
		this.Statistic[stat] += changeAmt;
	}
	
	//Get statistic of entity.
	public final Statistic getStat(Statistic stat){
		return this.statistics[stat];		
	}
	
	//Get Entity's current level.
	public final int getLevel(){
		
	}
	
	//Advance level.
	public void levelUp(){
		this.level += 1;
	}
	
}
