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
   public int attack() {
      int baseAttack = super.attack(); // Виклик базового методу атаки з Hero
      if (charges > 0) {
         charges--; // Зменшуємо кількість стріл після атаки
         return baseAttack + 10; // Додаємо 10 до базової атаки
      } else {
         return baseAttack; // Якщо немає стріл, звичайна атака
      }
   }
   
   @Override
   public String toString() {
      return String.format("%s, charges: %s",
            super.toString(), charges);
   }
}
