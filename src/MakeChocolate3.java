public class MakeChocolate3 {
  public int makeChocolate(int small, int big, int goal) {
    if (goal - (big * 5) > small || goal % 5 > small) {
      return - 1;
    }
    if (goal > big * 5) {
      return (goal - big * 5);
    } else {
      return (goal % 5);
    }
  }
}
