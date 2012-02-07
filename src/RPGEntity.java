import java.util.ArrayList;


public class RPGEntity {

	/* Vars */
	private int entityID;
	private int level;
	private ArrayList<Buff> buffs;
	private ArrayList<Debuff> debuffs;
	private HitPoints hitpoints;
	private Resource resources;
	private ArrayList<Statistic> statistics;
	private ArrayList<Skill> abilities;
	
	/* Methods */
	//Constructor
	RPGEntity(){
		// Will need a method to pull total & add in this id
		// this.entityID =
		this.level = 0;
		this.buffs = new ArrayList<Buff>();
		this.debuffs = new ArrayList<Buff>();
		this.hitpoints = new HitPoints;
		this.resources = new Resource;
		this.statistics = new ArrayList<Statistic>();
		this.abilities = new ArrayList<Skill>();
		
	}
	
	//Attack target entity.
	public void attack(RPGEntity target){
		//Logic containing attack information.
	}
	
	//Heal entity.
	public void heal(int healAmt){
		this.hitpoints.increase(healAmt);
	}
	
	//Entity Dies
	public void die(){
		//Logic. Now with more death.
	}
	
	//Set statistic of entity.
	public void setStat(Statistic stat, int changeAmt){
		this.statistics[stat] += changeAmt;
	}
	
	//Get statistic of entity.
	public final Statistic getStat(Statistic stat){
		return this.statistics[stat];		
	}

	//Get Entity's current level.
	//Do we want to abstract this or leave it simply as an atty?
	public final int getLevel(){
		return this.level;
	}

	//Advance level.
	public void levelUp(){
		this.level += 1;
	}
	
}
