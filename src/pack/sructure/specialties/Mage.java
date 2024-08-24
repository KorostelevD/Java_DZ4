package pack.sructure.specialties;

import pack.sructure.base.Hero;

public abstract class Mage extends Hero {
   private int mana;
   
   public Mage(String name, int HP, int maxAttack, int mana) {
      super(name, HP, maxAttack);
      this.mana = mana;
   }
   
   public int getMana() {
      return mana;
   }
   
   public void setMana(int mana) {
      this.mana = mana;
   }
   
   @Override
   public String toString() {
      return String.format("%s, mana: %s",
            super.toString(), mana);
   }
}
