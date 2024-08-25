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
   public int attack() {
      int baseAttack = super.attack(); // Виклик базового методу атаки з Hero
      if (mana > 0) {
         mana = mana - 10; // Зменшуємо кількість мани після атаки
         return baseAttack + 10; // Додаємо 10 до базової атаки
      } else {
         return baseAttack; // Якщо немає мани, звичайна атака
      }
   }

   @Override
   public String toString() {
      return String.format("%s, mana: %s",
            super.toString(), mana);
   }
}
