package pack.sructure.base; //папка

import java.util.Random;

public class Hero {
   protected static final Random random;
   
   static {
      random = new Random();
   }
   private String unit; // Поле для зберігання імені юніта
   private String name;
   private int HP;
   private int maxAttack;
   private boolean alive;

   //Ініціалізатор
   {
      generateUnit(); //Додаємо ім'я Юніта
      alive = true;
   }
   
   public Hero(String name, int HP, int maxAttack) {
      this.name = name;
      setHP(HP);
      setMaxAttack(maxAttack);
   }
   
   public int getHP() {
      return HP;
   }
   
   public void setHP(int HP) {
       this.HP = Math.max(HP, 0);
      if (this.HP <= 0)
         alive = false;
   }
   
   
   public Hero(int maxAttack) {
      setMaxAttack(maxAttack);
   }
   
   public int getMaxAttack() {
      return maxAttack;
   }
   
   public void setMaxAttack(int maxAttack) {
      if (maxAttack > 0)
         this.maxAttack = maxAttack;
   }
   
   public boolean isAlive() {
      return alive;
   }
   
   public void setAlive(boolean alive) {
         this.alive = alive;
   }
   
   public void takeDamage(int attack) {
      setHP(this.HP - Math.max(attack,0));
   }

   public int attack(){
      return random.nextInt(maxAttack);
   }

   // Метод для генерації імені Юніта
   private void generateUnit() {
      int randomNumber = random.nextInt(1000); // Генеруємо випадкове число від 0 до 999
      this.unit = "Unit #" + randomNumber; // Об'єднуємо число з "Unit"
   }
   
   @Override
   public String toString() {
      return String.format("%s, name: %s, HP %s, maxAttack: %s, alive: %s",
            unit,name, HP, maxAttack, alive);
   }
}
