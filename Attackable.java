public interface Attackable {
  // Attackable things must have a health
  int getHealth();

  void takeDamage(int damageAmount);

  void setHealth(int health);
}