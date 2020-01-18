package resources;

import java.util.ArrayList;

public class Unit
{
    public String name;

    // fields explicitly for use by playingField
    // flipped to true by "dance" action
    private boolean hasAction;
    // coordinates in the form of {row, column}
    private Integer[] location;

    // "infantry", "cavalry", "flying", "armored"
    private String unitType;

    // {weapon, A, B, C, D, seal}
    // Skills / Interactions class might treat weapons differently but to a Unit they're all skills
    private String[] skills;
    // separate from skills for convenience
    private Assist assist;
    private Special special;
    private int specialCharge;

    // the following are stat related fields of the form:
    // {hp, atk, spd, def, res}
    private Integer[] baseStats;
    private Integer[] visibleBuffs;
    private Integer[] combatBuffs;
    private Integer[] visibleDebuffs;
    private Integer[] combatDebuffs;
    // panicked unit has visibleBuffs flipped to negative
    private boolean panic;
    // granted by Ardent Durandal
    private boolean bonusDoubler;

    // other statuses
    // "teleport", "globalTeleport", "gravity", "movementIncrease"
    private ArrayList<String> movementModifiers;
    private boolean cannotCounterattack;
    // not from the skill
    private boolean triangleAdept;
    // different from the skill guard: this is a debuff
    private boolean guard;
    // this is different from falchion effectiveness: granted by Naga
    private boolean dragonEffective;
    private boolean isolation;

    public Unit
    (String _name, String _unitType, String[] _skills, Assist _assist, Special _special, Integer[] _baseStats)
    {
        // fields determined by constructor
        name = _name;
        unitType = _unitType;
        skills = _skills;
        assist = _assist;
        special = _special;
        // specialCharge = _special.getCharge();
        baseStats = _baseStats;

        // fields initialized to be used later
        hasAction = false;
        location = new Integer[2];
        visibleBuffs = new Integer[5];
        combatBuffs = new Integer[5];
        visibleDebuffs = new Integer[5];
        combatDebuffs = new Integer[5];
        panic = false;
        bonusDoubler = false;
        movementModifiers = new ArrayList<String>();
        cannotCounterattack = false;
        triangleAdept = false;
        guard = false;
        dragonEffective = false;
        isolation = false;
    }

    // getters

    public boolean isHasAction()
    {
        return hasAction;
    }

    public Integer[] getLocation()
    {
        return location;
    }

    public String getUnitType()
    {
        return unitType;
    }

    public String[] getSkills()
    {
        return skills;
    }

    public Assist getAssist()
    {
        return assist;
    }

    public Special getSpecial()
    {
        return special;
    }

    public Integer[] getBaseStats()
    {
        return baseStats;
    }

    public Integer[] getVisibleBuffs()
    {
        return visibleBuffs;
    }

    public Integer[] getCombatBuffs()
    {
        return combatBuffs;
    }

    public Integer[] getVisibleDebuffs()
    {
        return visibleDebuffs;
    }

    public Integer[] getCombatDebuffs()
    {
        return combatDebuffs;
    }

    public boolean isPanic()
    {
        return panic;
    }

    public boolean isBonusDoubler()
    {
        return bonusDoubler;
    }

    public ArrayList<String> getmovementModifiers()
    {
        return movementModifiers;
    }

    public boolean isCannotCounterattack()
    {
        return cannotCounterattack;
    }

    public boolean isTriangleAdept()
    {
        return triangleAdept;
    }

    public boolean isGuard()
    {
        return guard;
    }

    public boolean isDragonEffective()
    {
        return dragonEffective;
    }

    public boolean isIsolation()
    {
        return isolation;
    }

    // setters

    public void setHasAction(boolean input)
    {
        hasAction = input;
    }

    public void setLocation(Integer[] input)
    {
        location = input;
    }

    public void setUnitType(String input)
    {
        unitType = input;
    }

    public void setSkills(int inputIndex, String inputSkill)
    {
        skills[inputIndex] = inputSkill;
    }

    public void setAssist(Assist input)
    {
        assist = input;
    }
    
    public void setSpecial(Special input)
    {
        special = input;
    }

    public void setBaseStats(int inputIndex, Integer inputStat)
    {
        baseStats[inputIndex] = inputStat;
    }

    public void setVisibleBuffs(int inputIndex, Integer inputStat)
    {
        visibleBuffs[inputIndex] = inputStat;
    }

    public void setCombatBuffs(int inputIndex, Integer inputStat)
    {
        combatBuffs[inputIndex] = inputStat;
    }

    public void setVisibleDebuffs(int inputIndex, Integer inputStat)
    {
        visibleDebuffs[inputIndex] = inputStat;
    }

    public void setCombatDebuffs(int inputIndex, Integer inputStat)
    {
        combatDebuffs[inputIndex] = inputStat;
    }

    public void setPanic(boolean input)
    {
        panic = input;
    }

    public void setBonusDoubler(boolean input)
    {
        bonusDoubler = input;
    }

    public void addMovementModifiers(String input)
    {
        movementModifiers.add(input);
    }

    public void removeMovementModifiers(String input)
    {
        movementModifiers.remove(input);
    }

    public void setCannotCounterattack(boolean input)
    {
        cannotCounterattack = input;
    }

    public void setTriangleAdept(boolean input)
    {
        triangleAdept = input;
    }

    public void setGuard(boolean input)
    {
        guard = input;
    }

    public void setDragonEffective(boolean input)
    {
        dragonEffective = input;
    }

    public void setIsolation(boolean input)
    {
        isolation = input;
    }  
}