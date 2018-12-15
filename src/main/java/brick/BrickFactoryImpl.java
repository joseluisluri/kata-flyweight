package brick;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class BrickFactoryImpl implements BrickFactory {

    private Map<Integer, Brick> bricks = new HashMap<>();

    public Brick getBrick(BrickType type, BrickColor color) {
        // Find instance if exists
        Integer hash = Objects.hash(type, color);
        Brick brick = bricks.get(hash);

        // If not exists, create once and store it
        if (Objects.isNull(brick)) {
            switch (type) {
                case SQUARE:
                    brick = new Brick(2, 2, color);
                    break;
                case RECTANGLE:
                    brick = new Brick(4, 2, color);
                    break;
                default:
                    throw new UnsupportedOperationException("Brick type not implemented");
            }

            bricks.put(hash, brick);
        }

        return brick;
    }

}