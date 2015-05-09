public class Obstacle extends PositionedEntity{
    
    public Obstacle(String name, Point position){
        super(name, position, "obstacle");
        imgs.add("images/obstacle.bmp");
    }
}