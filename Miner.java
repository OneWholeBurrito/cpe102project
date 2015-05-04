public abstract class Miner extends ResourceEntity{

    private double animationRate;
    public Miner(String name, int resourceLimit, Point position, double rate, double animationRate, int resourceCount){
        super(name, position, rate, resourceLimit, resourceCount, "miner")
    }
    
    public double getAnimationRate(){return animationRate;}
    
    public Point nextPosition(WorldModel world, Point destPt){
        int horiz = Sign.compare(destPt.getX() - position.getX());
        Point newPt = new Point(position.getX() + horiz, position.getY());
        if(horiz == 0 || world.isOccupied(newPt)){
            int vert = Sign.compare(destPt.getY() - position.getY());
            newPt = Point(position.getX(), position.getY() + vert);
            if(vert == 0 || world.isOccupied(newPt)){
                newPt = Point(position.getX(), position.getY());
            }
        }
        return newPt;
    }
}