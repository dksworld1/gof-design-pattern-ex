package desing.pattern.structure.bridge;

interface Shape
{
   public void draw();                             // low-level
   public void resizeByPercentage(double pct);     // high-level
}