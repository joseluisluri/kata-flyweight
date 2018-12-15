package brick;

import brick.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

//
// Don't edit this file
//
public class BrickFactoryTest {

    private BrickFactory brickFactory;

    @Before
    public void setUp() {
        Brick.numInstances = 0;
        brickFactory = new BrickFactoryImpl();
    }

    @Test
    public void getBrick_createTreeInstances_whenThreeTypesOfBricksAreUsed() {
        // Act
        brickFactory.getBrick(BrickType.SQUARE, BrickColor.RED);
        brickFactory.getBrick(BrickType.SQUARE, BrickColor.RED);
        brickFactory.getBrick(BrickType.SQUARE, BrickColor.YELLOW);
        brickFactory.getBrick(BrickType.SQUARE, BrickColor.YELLOW);
        brickFactory.getBrick(BrickType.RECTANGLE, BrickColor.BLUE);
        brickFactory.getBrick(BrickType.RECTANGLE, BrickColor.BLUE);
        brickFactory.getBrick(BrickType.RECTANGLE, BrickColor.BLUE);

        // Assert
        Assert.assertEquals(3, Brick.numInstances);
    }

    @Test
    public void getBrick_return2x2RedBrick_whenBrickTypeIsSquareAndBrickColorIsRed() {
        // Act
        Brick brick = brickFactory.getBrick(BrickType.SQUARE, BrickColor.RED);

        // Assert
        Assert.assertEquals(2, brick.getWidth());
        Assert.assertEquals(2, brick.getHeight());
        Assert.assertEquals(BrickColor.RED, brick.getColor());
    }

    @Test
    public void getBrick_return2x4_whenBrickTypeIsRectangleAndBrickColorIsBlue() {
        // Act
        Brick brick = brickFactory.getBrick(BrickType.RECTANGLE, BrickColor.BLUE);

        // Assert
        Assert.assertEquals(4, brick.getWidth());
        Assert.assertEquals(2, brick.getHeight());
        Assert.assertEquals(BrickColor.BLUE, brick.getColor());
    }

}
