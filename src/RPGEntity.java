
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
	
<<<<<<< HEAD
	//Entity Dies
	public void die(){
		//Logic. Now with more death.
	}
	
	//Set statistic of entity.
	public void setStat(Statistic stat, int changeAmt){
		this.statistics[stat] += changeAmt;
=======
	//Set statistic of entity.
	public void setStat(Statistic stat, int changeAmt){
		this.Statistic[stat] += changeAmt;
>>>>>>> 5cdf7f04d1102ee745b065670ec43004a726152a
	}
	
	//Get statistic of entity.
	public final Statistic getStat(Statistic stat){
		return this.statistics[stat];		
	}
	
	//Get Entity's current level.
<<<<<<< HEAD
	//Do we want to abstract this or leave it simply as an atty?
	public final int getLevel(){
		return this.level;
=======
	public final int getLevel(){
		
>>>>>>> 5cdf7f04d1102ee745b065670ec43004a726152a
	}
	
	//Advance level.
	public void levelUp(){
		this.level += 1;
	}
	
}
