package resources;

import java.util.ArrayList;

public class Skill
{
    // used by interactions to actually know what to check for
    private ArrayList<String> effects;
    // when a skill effect will be active
    // actual conditions (e.g. hp < 75%)
    // when to trigger (e.g. start of turn, in combat, post combat, etc.)
    private String[] triggerConditions;
    // distant counter, for melees only
    private boolean increaseCounterattackRange;
    // for fury, push skills, mystic boost, etc.
    private int postCombatHealthModifier;
    // stats buffs & debuffs
    private Integer[] selfVisibleStatModifiers;
    private Integer[] selfCombatStatModifiers;
    private Integer[] causeVisibleStatModifiers;
    private Integer[] causeCombatStatModifiers;
    private boolean causePanic;
    private boolean nullifySelfDebuffs;
    private boolean nullifyEnemyBuffs;
    // cooldown related
    private int selfCooldownModifier;
    private int enemyCooldownModifier;
    // effectiveness related, type specified by string
    // special case for Triangle Adept
    private String grantEffectiveness;
    private String neutralizeEffectiveness;
    // adaptive damage (e.g. breath, Felicia's Plate)
    private boolean grantAdaptiveDamage;
    private boolean nullifyAdaptiveDamage;
    // damage reduction (e.g. 0.5)
    private int reductionRatio;
    // followup related
    // "guarantee", "prevent", "desperation", "vantage"
    private String selfFollowupModifier;
    private String enemyFollowupModifier;
    // special related
    private boolean SelfModifySpecialCharge;
    private boolean causeModifySpecialCharge;
    // "flat", "defPercentage", etc.
    private String modifySpecialTriggerDamage;
    // calculated differently depending on previous String
    private int modifySpecialTriggerDamageAmount;
    // movement related
    // "teleport", "globalTeleport", "gravity", "movementIncrease"
    private boolean grantTeleport;
    private boolean grantGlobalTeleport;
    private boolean grantMovementIncrease;
    private boolean causeGravity;

    public Skill (ArrayList<String> _effects, String[] _triggerConditions)
    {
        setupSkill(_effects, _triggerConditions);
    }

    private void setupSkill(ArrayList<String> _effects, String[] _triggerConditions)
    {
        
    }
}