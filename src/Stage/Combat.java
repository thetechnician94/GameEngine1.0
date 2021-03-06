/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stage;

import java.util.ArrayList;

/**
 *
 * @author 94tyl
 */
public class Combat {

    private String enemyName;
    private int enemyHealth;
    private int enemyBaseDamage;
    private int enemyDamageRange;
    private String enemyType;
    private int hitChance;
    private int deathStage;
    private int winStage;
    private int firstAttackChance;
    private int maxEnemyHealth;


    public Combat(String name, int health, int damage, int damageRange, String type, int hitChance, int deathStage, int winStage, int firstAttack) {
        enemyName = name;
        enemyHealth = health;
        maxEnemyHealth = enemyHealth;
        enemyBaseDamage = damage;
        enemyDamageRange = damageRange;
        enemyType = type;
        firstAttackChance = firstAttack;
        this.hitChance = hitChance;
        this.deathStage = deathStage;
        this.winStage = winStage;
    }

    public void attackEnemy(int damage) {
        enemyHealth -= damage;
        if (getEnemyHealth() < 0) {
            enemyHealth = 0;
        }
    }


    public void resetCombat() {
        this.enemyHealth = getMaxEnemyHealth();
    }

    public int enemyAttacks() {
        int rand = (int) (Math.random() * 100);
        if (rand > hitChance) {
            return 0;
        }
        int rand2 = (int) (Math.random() * enemyDamageRange);
        int rand3 = (int) (Math.random() * 100);
        if (rand3 < 50) {
            rand2 *= -1;
        }
        return enemyBaseDamage + rand2;
    }

    public boolean isAttackingFirst() {
        int rand = (int) (Math.random() * 100);
        if (rand < firstAttackChance) {
            return true;
        }
        return false;
    }

    /**
     * @return the enemyName
     */
    public String getEnemyName() {
        return enemyName;
    }

    /**
     * @return the enemyHealth
     */
    public int getEnemyHealth() {
        return enemyHealth;
    }

    /**
     * @return the enemyBaseDamage
     */
    public int getEnemyBaseDamage() {
        return enemyBaseDamage;
    }

    /**
     * @return the enemyDamageRange
     */
    public int getEnemyDamageRange() {
        return enemyDamageRange;
    }

    /**
     * @return the enemyType
     */
    public String getEnemyType() {
        return enemyType;
    }

    /**
     * @return the hitChance
     */
    public int getHitChance() {
        return hitChance;
    }

    /**
     * @return the deathStage
     */
    public int getDeathStage() {
        return deathStage;
    }

    /**
     * @return the winStage
     */
    public int getWinStage() {
        return winStage;
    }

    /**
     * @return the maxEnemyHealth
     */
    public int getMaxEnemyHealth() {
        return maxEnemyHealth;
    }
}
