package pack.sructure.specialties;

import pack.sructure.base.Hero;

public abstract class Warrior extends Hero {
   private int armor;
   
   public Warrior(String name, int HP, int maxAttack, int armor) {
      super(name, HP, maxAttack);
      this.armor = armor;
   }
   
   public int getArmor() {
      return armor;
   }
   
   public void setArmor(int armor) {
      this.armor = armor;
   }

   @Override
   public void takeDamage(int attack) {
      // Використання захисту: броня зменшує шкоду
      int damage = Math.max(0, attack - armor); // Щоб уникнути негативного значення шкоди
      super.takeDamage(damage); // Викликаємо базовий метод з модифікованою шкодою

   }


}
