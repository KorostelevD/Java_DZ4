package pack.sructure.specialties;

import pack.sructure.base.Hero;

public abstract class Archer extends Hero {
   private int charges;
   
   public Archer(String name, int HP, int maxAttack, int charges) {
      super(name, HP, maxAttack);
      this.charges = charges;
   }
   
   public int getCharges() {
      return charges;
   }
   
   public void setCharges(int charges) {
      this.charges = charges;
   }
   
   @Override
   public String toString() {
      return String.format("%s, charges: %s",
            super.toString(), charges);
   }
}
